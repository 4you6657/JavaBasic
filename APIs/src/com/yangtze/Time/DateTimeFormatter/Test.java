package com.yangtze.Time.DateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        /*
            DateTimeFormatter: 格式化器，用于时间的格式化、解析（代替SimpleDateFormat）
            1、SimpleDateFormat是线程不安全的
         */

        // public static DateTimeFormatter ofPattern(时间格式)  ：   获取格式化器对象
        // public String format(时间对象)                       ：   格式化时间

        // 1、创建一个日期时间格式化器对象
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        // 2、对时间进行格式化
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);


        String rs = formatter.format(now); // 正向格式化（用格式化器去格式化时间）
        System.out.println(rs);

        // 3、格式化时间，其实还有一种方案
        String rs2 = now.format(formatter); // 反向格式化（用时间去格式化自己）
        System.out.println(rs2);

        // 4、解析时间：一般使用LocalDateTime提供的解析方法去解析
        String dateStr = "2029年12月12日 12:12:11";
        LocalDateTime ldt = LocalDateTime.parse(dateStr, formatter);
        System.out.println(ldt);


    }
}
