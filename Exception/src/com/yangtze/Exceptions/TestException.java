package com.yangtze.Exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestException {

    // 抛出异常（throws）:在方法上使用throws关键字，可以将方法内部出现的异常抛出去给调用者处理
    public static void main(String[] args) throws ParseException {

        // 运行时异常
        Integer value = Integer.valueOf("123");
        // System.out.println(value);

        int[] arr = {11, 22, 33};
        // System.out.println(arr[5]);

        /*
            异常的体系：
                Error：系统级别错误（属于严重问题），也就是说系统一旦出现问题，sun公司会把这些问题封装成error对象给出来
                        Error是sun公司自己用的，不是给程序员用的，因此开发人员不需要理会。
                Exception：异常，代表程序可能出现的问题，所以，开发人员通常会用Exception以及它的子类来封装程序出现的问题。
                    + 运行时异常：RuntimeException及其子类，编译阶段不会出现错误提醒，运行时出现的异常（如：数组索引越界异常）
                    + 编译时异常：编译阶段就会出现错误提醒的。（如：日期解析异常）
         */


        // 编译时异常(受检查的异常)

        // try...catch{} 直接捕获程序中出现的异常
        try { // 监视块中的程序是否会出异常
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse("2024-06-16 13:44:23");
        } catch (ParseException e) {
            // 出现了异常，就捕获异常，用RuntimeException()类封装并创建出异常对象
            throw new RuntimeException(e);
        }
    }
}
