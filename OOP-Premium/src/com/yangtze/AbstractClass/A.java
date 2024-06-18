package com.yangtze.AbstractClass;

public abstract class A {

    /**
     * 抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
     * 类该有的成员（成员变量、方法、构造器）抽象类都可以有
     * 抽象类最主要的特点：抽象类不能创建对象，仅作为一种特殊的父类，让子类继承并实现
     * 一个类继承抽象类，必须重写完抽象类的全部抽象方法，否则这个类也必须定义成抽象类
     */

    private String name;
    public static String schoolName;

    // 抽象方法
    public abstract void run();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        A.schoolName = schoolName;
    }

    public A() {
    }

    public A(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AbstractClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
