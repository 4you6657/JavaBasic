package com.yangtze.Utils.System;

public class Test {
    public static void main(String[] args) {
        // public static void exit(int status);
        // 终止当前运行的Java虚拟机
        // 该参数用作状态代码；按照惯例，非零状态代码表示异常终止。
        // System.exit(0); // 人为终止虚拟机(不要使用)
        // System.out.println("++++++++++");

        /*
            public static long currentTimeMillis();
            - 获取当前系统的时间
            - 返回的是long类型的时间毫秒值：指的是从 1970-1-1 00:00:00开始走到此刻的总的毫秒值。(1s = 1000ms)
            - 用途：作程序的性能分析
         */
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);

        for (int i = 0; i < 1000000; i++) {
            System.out.println("输出了:" + i);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("总用时:" + (endTime - startTime) / 1000.0 + "s");
    }
}
