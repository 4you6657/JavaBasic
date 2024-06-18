package com.yangtze.Time.Calendar;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        // 1 得到系统时间对应的日历对象
        Calendar now = Calendar.getInstance();
        System.out.println(now);

        // 2 获取日历中的某个信息
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day_of_month = now.get(Calendar.DAY_OF_MONTH);
        System.out.println(year);
        System.out.println(month + 1);
        System.out.println(day_of_month);

        // 3 拿到日历中记录的日期对象
        Date d = now.getTime();
        System.out.println(d);

        // 4 获取时间毫秒值
        long timeInMillis = now.getTimeInMillis();
        System.out.println(timeInMillis);


        // 5 修改日历的某个信息
        now.set(Calendar.MONTH, 9);
        System.out.println(now);

        // 6 为某个信息增加/减少指定的值
        now.add(Calendar.DAY_OF_YEAR, 100);
        now.add(Calendar.DAY_OF_YEAR, -10);
        now.add(Calendar.HOUR, 12);
        System.out.println(now);


    }
}
