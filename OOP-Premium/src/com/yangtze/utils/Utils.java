package com.yangtze.utils;

import java.util.Random;

public class Utils {

    // 工具类没有创建对象的需求，因此建议将工具类的构造器进行私有
    private Utils()
    {

    }
    public static String createValCode(int length) {
        String valCode = "";

        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Random r = new Random();

        // 开始定义一个循环产生每位随机字符
        for (int i = 0; i < length; i++) {
            // 随机一个字符范围内的索引
            int index = r.nextInt(data.length());
            // 根据索引去全部字符中提取该字符
            // valCode.append(valCode.charAt(index)); // valCode = valCode + "字符"
            valCode += data.charAt(index);
        }
        System.out.println(valCode);
        return valCode;
    }
}
