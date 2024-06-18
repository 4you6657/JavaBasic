package com.yangtze.Time.LocalDateUsage;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        /*
            传统的时间类（Date, SimpleDateFormat, Calendar）存在如下问题
                1、设计不合理、使用不方便，很多API都被淘汰了
                2、都是可变对象，修改后会丢失最开始的时间信息
                3、线程不安全
                4、不能精确到纳秒，只能精确到毫秒
         */


        /*
            LocalDate       :   代表本地日期（年、月、日、星期）
            LocalTime       :   代表本地时间（时、分、秒、纳秒）
            LocalDateTime   :   代表本地日期、时间（年、月、日、星期、时、分、秒、纳秒）
         */

        // 0、获取本地日期对象
        LocalDate ld = LocalDate.now(); // 年、月、日
        System.out.println(ld);

        // 1、获取日期对象中的信息
        int year = ld.getYear();                        // 年
        int month = ld.getMonthValue();                 // 月(1-12)
        int dayOfWeek = ld.getDayOfWeek().getValue();   // 星期几
        int dayOfMonth = ld.getDayOfMonth();            // 日
        int dayOfYear = ld.getDayOfYear();              // 一年中的第几天

        // 2、直接修改某个信息：withYear. withMonth, withDayOfMonth, withDayOfYear
        LocalDate ld2 = ld.withYear(2099);
        System.out.println(ld2);

        LocalDate ld3 = ld2.withMonth(12);
        System.out.println(ld3);

        // 3、把某个信息加多少：plusYears, plusMonths, plusDays, plusWeeks
        LocalDate ld4 = ld.plusYears(2);
        LocalDate ld5 = ld.plusMonths(12);

        // 4、把某个信息减多少：minusYears, minusMonths, minusDays, minusWeeks
        LocalDate ld6 = ld2.minusYears(2);

        // 5、获取指定日期的LocalDate对象：public static LocalDate of(int year, int month, int day, int dayOfMonth)
        LocalDate ld7 = LocalDate.of(2099, 12, 12);
        LocalDate ld8 = LocalDate.of(2099, 12, 12);

        // 6、判断两个日期对象，是否相等，在前还是在后：equals, isBefore, isAfter
        boolean bIsEqual = ld8.equals(ld7);
        System.out.println(bIsEqual);

        boolean bIsAfter = ld8.isAfter(ld);
        System.out.println(bIsAfter);
        boolean bIsBefore = ld8.isAfter(ld);
        System.out.println(bIsBefore);


    }
}
