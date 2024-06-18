package com.yangtze.Time.Extra;

import java.time.Duration;
import java.time.LocalDateTime;

public class TestDuration {
    public static void main(String[] args) {
        /*
            Duration（持续时间）:
                可以用于计算两个时间对象相差的天数、小时数、分数、秒数、纳秒数；
                支持LocalTime、LocalDateTime、Instant等时间
         */

        LocalDateTime start = LocalDateTime.of(2024, 11, 11, 11, 11, 11);
        LocalDateTime end = LocalDateTime.of(2024, 11, 11, 11, 11, 15);

        // 1、得到Duration对象
        Duration duration = Duration.between(start, end);

        // 2、获取两个时间对象间隔的信息
        long days = duration.toDays();
        long hours = duration.toHours();
        long minutes = duration.toMinutes();
        long seconds = duration.toSeconds();
        long millis = duration.toMillis();
        long nanos = duration.toNanos();

        System.out.println(days);
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
        System.out.println(millis);
        System.out.println(nanos);
    }
}
