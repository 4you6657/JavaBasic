package com.yangtze.Time.LocalDateTimeUsage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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

        // 0、获取本地日期时间对象
        LocalDateTime ldt = LocalDateTime.now(); // 年、月、日
        System.out.println(ldt);

        // 1、获取日期对象中的信息
        int year = ldt.getYear();                       // 年
        int month = ldt.getMonthValue();                // 月(1-12)
        int dayOfMonth = ldt.getDayOfMonth();           // 日
        int dayOfYear = ldt.getDayOfYear();             // 一年中的第几天
        int dayOfWeek = ldt.getDayOfWeek().getValue();  // 星期几
        int hour = ldt.getHour();                       // 时
        int minute = ldt.getMinute();                   // 分
        int second = ldt.getSecond();                   // 秒
        int nano = ldt.getNano();                       // 纳秒


        // 2、直接修改时间信息：withYear. withMonth, withDayOfMonth, withDayOfYear, withHour, withMinute, withSecond, withNano
        LocalDateTime ldt2 = ldt.withYear(2099);
        System.out.println(ldt2);
        LocalDateTime ldt3 = ldt2.withMonth(12);
        System.out.println(ldt3);

        // 3、把某个信息加多少：plusYears, plusMonths, plusDays, plusWeeks, plusHours, plusMinutes, plusSeconds, plusNanos
        LocalDateTime ldt4 = ldt.plusYears(2);
        LocalDateTime ldt5 = ldt.plusMonths(12);
        LocalDateTime ldt6 = ldt.plusDays(12);
        LocalDateTime ldt7 = ldt.plusWeeks(12);
        LocalDateTime ldt8 = ldt.plusHours(12);
        LocalDateTime ldt9 = ldt.plusMinutes(12);
        LocalDateTime ldt10 = ldt.plusSeconds(12);
        LocalDateTime ldt11 = ldt.plusNanos(12);

        // 4、把某个信息减多少：minusYears, minusMonths, minusDays, minusWeeks, minusHours, minusMinutes, minusSeconds, minusNanos
        LocalDateTime ldt12 = ldt2.minusYears(2);
        LocalDateTime ldt13 = ldt2.minusMonths(2);
        LocalDateTime ldt14 = ldt2.minusDays(2);
        LocalDateTime ldt15 = ldt2.minusWeeks(2);
        LocalDateTime ldt16 = ldt2.minusHours(2);
        LocalDateTime ldt17 = ldt2.minusMinutes(2);
        LocalDateTime ldt18 = ldt2.minusSeconds(2);
        LocalDateTime ldt19 = ldt2.minusNanos(2);

        // 5、获取指定日期的LocalDate对象：public static LocalDate of(int year, int month, int day, int dayOfMonth, int hour, int minute, int second)
        LocalDateTime ldt20 = LocalDateTime.of(2099, 12, 12, 12, 12, 12, 12);
        LocalDateTime ldt21 = LocalDateTime.of(2099, 12, 12, 12, 12, 12, 12);

        // 6、判断两个日期对象，是否相等，在前还是在后：equals, isBefore, isAfter
        System.out.println(ldt15.equals(ldt13));
        boolean bIsAfter = ldt19.isAfter(ldt18);
        System.out.println(bIsAfter);
        boolean bIsBefore = ldt17.isAfter(ldt16);
        System.out.println(bIsBefore);

        // 7、可以把LocalDateTime转换成LocalDate和LocalTime
        /*
            public LocalDate toLocalDate()
            public LocalTime toLocalTime()
            public static LocalDateTime of(LocalDate date, LocalTime time)
         */

        LocalDate ld = ldt.toLocalDate();
        LocalTime lt = ldt.toLocalTime();
        System.out.println(ld);
        System.out.println(lt);
        LocalDateTime of = LocalDateTime.of(ld, lt);


    }
}
