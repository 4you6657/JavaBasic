package com.yangtze.Time.InstantUsage;

import java.time.Instant;

public class Test {
    public static void main(String[] args) {
        /*
            Instant: 时间线上的某个时刻/时间戳
                - 通过获取Instant对象可以拿到此刻的时间,该时间由两部分组成:从1970-01-01 00:00:00 开始走到此刻的总秒数+不够1秒的纳秒数
         */

        // public static Instant now()          :   获取当前时间的Instant对象（标准时间）
        Instant now = Instant.now();

        // public long getEpochSecond()         :   获取从1970-01-01T00:00:00开始记录的秒数
        long epochSecond = now.getEpochSecond();
        System.out.println(epochSecond);


        // public int getNano()                 :   从时间线开始，获取从第二个开始的纳秒数
        int nano = now.getNano();
        System.out.println(nano);

        // plusMillis plusSeconds plusNanos     :   增加时间系列的方法
        Instant instant = now.plusNanos(120);

        // minusMillis minusSeconds minusNanos  :   减少时间系列的方法
        System.out.println(instant.minusSeconds(30));

        // equals, isBefore, isAfter            :   判断系列的方法

        // Instant对象的作用: 代码的性能分析、记录用户的操作时间点
        Instant start = Instant.now();
        Instant end = Instant.now();

        // 传统的Date类，只能精确到毫秒，并且是可变对象
        // 新增的Instant类，可以精确到纳秒，并且是不可变对象，推荐用Instant代替Date


    }
}
