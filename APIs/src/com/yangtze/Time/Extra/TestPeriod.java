package com.yangtze.Time.Extra;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TestPeriod {
    public static void main(String[] args) {
        /*
            Period(一段时期)
                - 可以用于计算两个LocalDate对象 相差的年数、月数、天数
         */
        LocalDate start = LocalDate.of(2024,6,13);
        LocalDate end = LocalDate.of(2029,8,31);

        // 1、创建Period对象，封装两个日期对象。
        Period period = Period.between(start, end);
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd");
        // System.out.println(formatter);
    }
}
