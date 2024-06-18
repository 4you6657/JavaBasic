package com.yangtze.Interface;

public class TEST {
    public static void main(String[] args) {
        System.out.println(A.SCHOOL_NAME);

        D d = new D();
        d.testB1();
        d.testB2();
        d.testC1();
        d.testC2();


        /**
         * 接口的好处
         * 1、弥补了类单继承的不足，一个类同时可以实现多个接口
         * 2、让程序可以面向接口编程，这样程序员就可以灵活方便的切换各种业务实现
         */
    }
}
