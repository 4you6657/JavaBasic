package com.yangtze.Arrays.ObjectSortDefine;

public class Student implements Comparable<Student> {
    private String name;
    private double height;
    private int age;

    public Student() {

    }

    public Student(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //  制定比较规则
    // this, o
    @Override
    public int compareTo(Student o) {
        // 约定1：左边对象 > 右边对象，请您返回正整数
        // 约定2：左边对象 < 右边对象，请您返回负整数
        // 约定3：左边对象 = 右边对象，请您返回0
        // 按照年龄升序排序
/*        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return 0;
        }*/
        // return (this.age - o.age); // 年龄升序
        return (o.age - this.age); // 年龄升序
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
