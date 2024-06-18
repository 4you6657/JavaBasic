package com.yangtze.DesignPattern;

public class B {
    // 懒汉式单例设计模式
    // 拿对象时，才开始创建对象

    // 写法
    // 1、把类的构造器私有
    private B() {

    }

    // 2、定义一个类变量用于存储对象
    private static B b;

    // 3、提供一个类方法，保证返回的是同一个对象
    public static B getInstance() {
        if (b == null) {
            b = new B();
        }
        return b;
    }
}
