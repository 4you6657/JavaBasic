package com.yangtze.handleException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Refinements {
    public static void main(String[] args) {
        /*
            - 异常处理
                + throws
                + try-catch

            - 开发中对于异常的常见处理方式
                   如果：调用方法A --> 调用方法B --> 调用方法C
                   那么，常见方式有如下两种：
                1、方法A捕获异常，记录异常并响应合适的信息给用户 <-- 调用B出现异常,抛给方法B的调用者 <-- 调用C出现异常,抛给方法C的调用者
                2、方法A捕获异常，尝试重新修复 <-- 调用B出现异常,抛给方法B的调用者 <-- 调用C出现异常,抛给方法C的调用者
         */
        try {
            parseTime();
        } catch (Exception e) {
            e.getStackTrace(); // getStackTrace(): 打印出异常对象的信息
            throw new RuntimeException(e);
        }


    }

    public static void parseTime() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // Date d = sdf.parse("2024-06-16 21:40:00");
        Date d = sdf.parse("2024-06-16 21:40");
        System.out.println(d);
        readFiles();
    }

    public static void readFiles() throws Exception {
        // 输入流对象is 读取文件
        InputStream is = new FileInputStream("D:\\ExceptionLogs.txt");

    }
}
