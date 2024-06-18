package com.yangtze.finalKeyword;

public class TEST {
    // 用 final 关键字修饰的静态变量，一定要在初始化时赋值，否则会报错。
    // public static final 修饰的成员变量 叫做 常量，建议名称全部大写，多个单词之间用下划线_连接
    public static final String SCHOOL_NAME = "itcast";

    private final String name = "MIKE"; // 这样做是没有意义的。

    public static void main(String[] args) {

        // final修饰局部变量
        final int finalValue = 1;
        // finalValue = 2;

        // SCHOOL_NAME = "itheima"; 报错！

    }

    public static void buy(final double price) {
        // price++; 报错！
    }
}

// 1、final修饰的类不能被继承
// 2、final修饰的方法不能被重写
// 3、final修饰的变量只能赋值一次


/**
 * 变量
 * - 局部变量
 * - 成员变量
 * + 静态成员变量
 * + 实例成员变量
 */
