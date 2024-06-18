package com.yangtze.pkg;

import com.yangtze.pkg.itcast.Demo2;
import com.yangtze.pkg.meta.Demo3;

import java.util.Scanner;

/**
 *      目标：掌握如何在自己的程序中调用其它包下的程序，有哪些注意事项？
 *      包是用来分门别类的管理各种不同程序的，类似于文件夹，建包有利于程序的管理和维护
 **/
public class Test {
    public static void main(String[] args) {
        // 1、同一个包下的程序，可以直接访问。
        Demo d = new Demo();
        d.print();

        // 2、访问其它包下的程序，必须导包才可以访问
        Demo2 d2 = new Demo2();
        d2.print();

        // 3、自己的程序中调用Java提供的程序，也需要先导包才可以使用；注意：Java.lang包下的程序是不需要我们导包的，可以直接使用
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        System.out.println(result);

        // 4、访问多个其它包下的程序，这些程序名又一样的情况下，默认只能导入一个程序，另一个程序必须带包名和类名来访问
        Demo3 d3 = new Demo3();
        d3.print();
        com.yangtze.pkg.itcast.Demo3 d_itcast = new com.yangtze.pkg.itcast.Demo3();
        d_itcast.print();
    }
}
