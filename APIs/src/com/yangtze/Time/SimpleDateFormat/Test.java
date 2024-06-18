package com.yangtze.Time.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        /*
            SimpleDateFormat
                代表简单日期格式化，可以用来把日期对象、时间毫秒值格式化成我们想要的形式
            1、准备时间
         */
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        // 2、格式化日期对象和时间毫秒值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");

        String res = sdf.format(d);
        String res2 = sdf.format(time);

        System.out.println(res);
        System.out.println(res2);
        System.out.println("================================================================================");

        // 3、SimpleDateFormat解析 字符串时间 成为 日期对象
        String dateStr = "2024-06-12 21:58:40";
        // 3.1 创建简单日期格式化对象，指定的时间格式必须与被解析的时间格式一模一样，否则程序会出问题
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 将字符串时间解析成 Date类的实例化对象
        Date parseDate = sdf2.parse(dateStr);
        System.out.println(parseDate);


    }
}
