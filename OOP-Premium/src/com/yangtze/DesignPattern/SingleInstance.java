package com.yangtze.DesignPattern;

public class SingleInstance {
    public static void main(String[] args) {
        // 单例设计模式(饿汉式单例)
        // 确保一个类只有一个对象

        // 写法：
        // 把类的构造器私有
        // 定义一个类变量记住类的一个对象
        // 定义一个类方法，返回对象

        // A tryNewObject = new A();
        A instanceA = A.getObject();
        System.out.println(instanceA);

        B instanceB = B.getInstance();
    }
}
