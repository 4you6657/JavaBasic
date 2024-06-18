package com.yangtze.Time.Date;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        // 1、创建一个Date对象：代表系统当前时间信息
        Date d = new Date();
        System.out.println(d);

        // 2、拿到时间毫秒值(从1970-1-1 00：00：00直到此刻的总毫秒数)
        long lCurrentTime = d.getTime();
        System.out.println(lCurrentTime);

        // 3、把时间毫秒值转换成日期对象：2s之后的时间是多少？
        Date d2 = new Date(lCurrentTime + 2 * 1000);
        long lLaterTime = d2.getTime();
        System.out.println(lLaterTime);

        // 4、直接把日期对象的时间通过setTime()方法进行修改
        Date d3 = new Date();
        d3.setTime(lLaterTime);
        System.out.println(d3);
    }
}
