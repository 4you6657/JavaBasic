package com.yangtze.staticKeywordInMethods;

public class TEST {
    public static void main(String[] args) {
        // 目标：掌握有无static修饰方法的用法
        // 1、类方法的用法
        Student.printHelloWorld();
        // 也是可以使用对象来访问类方法(不推荐！)
        // new Student().printHelloWorld();

        // 2、实例方法的用法
        new Student().printHelloJava();
        // 对象.实例方法
        new Student().printIfPass();

        // 报错！说明实例方法只能用实例化对象来访问
        // Student.printIfPass();
    }
}
