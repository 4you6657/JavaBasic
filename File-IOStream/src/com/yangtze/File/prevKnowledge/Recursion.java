package com.yangtze.File.prevKnowledge;

public class Recursion {
    public static void main(String[] args) {
        /*
            方法递归
                - 递归是一种算法
                - 从形式上说：方法调用自身的形式称为方法递归（recursion）
                    + 认识递归的形式
                        + 直接递归：方法自己调用自己
                        + 间接递归：方法调用其他方法，其他方法又回调方法自己

                    + 应用、执行流程、算法思想
                    + 文件搜索的应用
         */
        test01();
    }

    public static void test01() {
        System.out.println("=== === ===");
        test01(); // 直接方法递归(Stack Over Flow) 方法 栈内存溢出
    }

    // 间接递归 test02() --> test03() --> test02()
    public static void test02() {
        System.out.println("=== === ===");
        test03();
    }

    public static void test03() {
        System.out.println("=== === ===");
        test02();
    }

    /*
        使用方法递归时需要注意的问题
            + 递归如果没有控制好终止，会出现递归死循环，导致栈内存溢出错误
     */
}
