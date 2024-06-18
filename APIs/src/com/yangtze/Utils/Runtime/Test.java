package com.yangtze.Utils.Runtime;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*
        Runtime
            + 代表程序所在的运行环境
            + Runtime是一个单例类
         */

        // public static Runtime getRuntime()   :   返回与当前Java应用程序关联的运行时对象
        Runtime r = Runtime.getRuntime();

        // public void exit(int status)         :   终止当前运行的虚拟机，该参数用作状态代码；按照惯例，非零状态代码表示异常终止。
        // r.exit(0);

        // public int availableProcessors()     :   获取虚拟机能够使用的处理器数
        System.out.println(r.availableProcessors());

        // public long totalMemory()            :   返回Java虚拟机中的内存总量
        System.out.println(r.totalMemory() / 1024.0 + "KB"); // 1024 = 1K 1024 × 1024 = 1M
        System.out.println(r.totalMemory() / 1024.0 / 1024.0 + "MB"); // 1024 = 1K 1024 × 1024 = 1M

        // public long freeMemory()             :   返回Java虚拟机中的可用内存量
        System.out.println(r.freeMemory() / 1024.0 / 1024.0 + "MB");

        // public Process exec(String command) 启动某个程序，并返回代表该程序的对象
        Process p = r.exec("D:\\Program Files\\5e\\5EClient\\5EClient.exe");
        Thread.sleep(5000); // 让程序在这里暂停5s后，继续执行后续代码。
        p.destroy(); // 销毁：即关闭程序

    }
}
