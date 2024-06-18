package com.yangtze.Time.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CASE {
    public static void main(String[] args) throws ParseException {

        // 1、获取时间字符串
        String start = "2023年11月11日 00:00:00";
        String end = "2023年11月11日 00:10:00";
        String t1 = "2023年11月11日 00:01:18";
        String t2 = "2023年11月11日 00:10:57";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        // 2、字符串解析成日期对象
        Date startDate = sdf.parse(start);
        Date endDate = sdf.parse(end);
        Date t1Date = sdf.parse(t1);
        Date t2Date = sdf.parse(t2);

        // 3、判断t1和t2是否秒杀成功
        // 3.1 把日期对象解析成时间毫秒值
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long t1Time = t1Date.getTime();
        long t2Time = t2Date.getTime();

        // 3.2 判断
        if (t1Time>=startTime && t1Time <=endTime){
            System.out.println("t1秒杀成功!");
        } else {
            System.out.println("t1秒杀失败！");
        }

        if (t2Time>=startTime && t2Time <=endTime){
            System.out.println("t2秒杀成功!");
        } else {
            System.out.println("t2秒杀失败！");
        }

    }
}
