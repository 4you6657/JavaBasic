package com.yangtze.ObjectClass;

import java.util.Objects;

public class Student {
    private String name;
    private double score;
    private int age;

    public Student(String name, double score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    /*
        Object类是Java所有类的祖宗类，因此，Java中所有类的对象都可以直接使用Object类中提供的一些方法：
            public String toString()        :   返回对象的字符串表示形式
            public boolean equals(Object o) :   判断两个对象是否相等(基类比较的是地址)
            protected Object clone()        :   对象克隆

        toString()存在的意义：toString()方法存在的意义就是为了被子类重写，以便返回对象具体的内容
        equals()存在的意义：直接比较两个对象的地址是否相同完全可以用"=="替代equals
        equals()存在的意义就是为了被子类重写，以便子类自己来定制比较规则(例如比较对象内容)
     */
    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", score=" + score + ", age=" + age + '}';
    }

    // 重写equals 方法，比较两个对象的内容一样就返回true
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Double.compare(student.getScore(), getScore()) == 0 && getAge() == student.getAge() && getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getScore(), getAge());
    }

    /*
        Object类提供的对象克隆方法
            当某个对象调用这个方法时，这个方法会复制一个一模一样的新对象返回
     */
}
