package com.yangtze.Time.ZoneIdUsage;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        /*
            1、ZoneId的常见方法
            public static ZoneId systemDefault(); // 获取系统默认的时区

            public static Set<String> getAvailableZoneIds; // 获取Java支持的全部时区Id

            public static ZoneId of(String zoneId); // 把某个时区id封装成ZoneId对象

            2、ZonedDateTime 带时区的时间
            public static ZonedDateTime now(ZoneId zone); // 获取某个时区的ZonedDateTime对象

            public static ZonedDateTime now(); // 获取系统默认时区的ZonedDateTime对象
         */

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        System.out.println(zoneId.getId());
        System.out.println(zoneId.toString());

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);

        ZoneId newYork = ZoneId.of("America/New_York");
        System.out.println(newYork);

        // 获取带时区的时间（美国纽约）
        ZonedDateTime newYorkDateTime = ZonedDateTime.now(newYork);
        System.out.println(newYorkDateTime);

        // 获取世界标准时间
        ZonedDateTime now = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(now);

        ZonedDateTime nowWithoutParam = ZonedDateTime.now();
        System.out.println(nowWithoutParam);

        // Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(newYork));


    }
}
