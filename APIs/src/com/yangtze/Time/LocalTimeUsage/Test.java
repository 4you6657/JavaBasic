package com.yangtze.Time.LocalTimeUsage;

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

        // 0、获取本地时间对象
        LocalTime lt = LocalTime.now(); // 时、分、秒、纳秒（不可变）
        System.out.println(lt);

        // 1、获取日期对象中的信息
        int hour = lt.getHour();       // 时
        int minute = lt.getMinute();   // 分
        int second = lt.getSecond();   // 秒
        int nano = lt.getNano();       // 纳秒

        // 2、修改时间：withHour. withMinute, withSecond, withNano
        LocalTime lt2 = lt.withHour(10);
        System.out.println(lt2);

        LocalTime lt3 = lt.withMinute(10);
        System.out.println(lt3);

        LocalTime lt4 = lt.withSecond(10);
        System.out.println(lt4);

        LocalTime lt5 = lt.withNano(10);
        System.out.println(lt5);

        // 3、把某个信息加多少：plusHours, plusMinutes, plusSeconds, plusNanos
        LocalTime lt6 = lt.plusHours(12);
        System.out.println(lt6);
        LocalTime lt7 = lt.plusMinutes(12);
        System.out.println(lt7);
        LocalTime lt8 = lt.plusSeconds(12);
        System.out.println(lt8);
        LocalTime lt9 = lt.plusNanos(12);
        System.out.println(lt9);

        // 4、把某个信息减多少：minusHours, minusMinutes, minusSeconds, minusNanos
        LocalTime lt10 = lt.minusHours(12);
        LocalTime lt11 = lt.minusMinutes(12);
        LocalTime lt12 = lt.minusSeconds(12);
        LocalTime lt13 = lt.minusNanos(12);

        // 5、获取指定时间的LocalTime对象：public static LocalDate of(int hour, int minute, int second)
        LocalTime lt14 = LocalTime.of(12, 12, 12);
        LocalTime lt15 = LocalTime.of(12, 12, 12);

        // 6、判断两个时间对象，是否相等，在前还是在后：equals, isBefore, isAfter
        System.out.println(lt14.equals(lt15));
        System.out.println(lt10.isBefore(lt11));
        System.out.println(lt12.isAfter(lt13));
    }
}
