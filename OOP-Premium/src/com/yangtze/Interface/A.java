package com.yangtze.Interface;

public interface A {
    // 成员变量（常量）
    String SCHOOL_NAME = "itheima";

    // 成员方法（抽象方法）
    void test();

    /**
     * 接口不能创建对象；接口是用来被类实现（implements）的，实现接口的类称为实现类
     * 一个类可以实现多个接口，实现类实现多个接口，必须重写全部接口的全部抽象方法
     */
}
