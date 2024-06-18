package com.yangtze.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        // BigDecimal: 用于解决浮点型运算时，出现结果失真的问题。

        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        // 1、转成字符串、封装成BigDecimal对象来运算
        // BigDecimal a1 = new BigDecimal(Double.toString(a));
        // BigDecimal b1 = new BigDecimal(Double.toString(b));

        // 推荐用以下方式：把小数转换成字符串再得到BigDecimal对象来使用（更简洁）
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);

        // BigDecimal c1 = a1.add(b1);
        // BigDecimal c1 = a1.subtract(b1);
        // BigDecimal c1 = a1.multiply(b1);
        BigDecimal c1 = a1.divide(b1); // 除法
        System.out.println(c1);

        BigDecimal i = BigDecimal.valueOf(0.1);
        BigDecimal j = BigDecimal.valueOf(0.3);
        BigDecimal k = i.divide(j, 2, RoundingMode.HALF_UP);
        System.out.println(k);

        // BigDecimal转double
        System.out.println(k.doubleValue());


    }
}
