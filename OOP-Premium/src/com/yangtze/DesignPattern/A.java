package com.yangtze.DesignPattern;

public class A {

    // 掌握单例设计模式的写法

    // 2、定义一个类变量记住类的一个对象
    private static final A instance = new A();

    // 1、私有化类的构造
    private A(){

    }

    // 3、定义一个类方法返回类的对象
    public static A getObject(){
        return instance;
    }
}
