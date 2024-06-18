package com.yangtze.regexUsage;

public class RegexTest {
    public static void main(String[] args) {

        System.out.println(bCheckIfQQFormatLegal(""));
        System.out.println(bCheckIfQQFormatLegal(null));
        System.out.println(bCheckIfQQFormatLegal("123456"));
        System.out.println(bCheckIfQQFormatLegal("123456abbf"));
        System.out.println("==================================================");
        System.out.println(bCheckIfQQFormatLegalUsingRegex(""));
        System.out.println(bCheckIfQQFormatLegalUsingRegex(null));
        System.out.println(bCheckIfQQFormatLegalUsingRegex("123456"));
        System.out.println(bCheckIfQQFormatLegalUsingRegex("123456abbf"));
    }


    /*
        使用正则表达式对数据格式的合法性进行校验，更简单、快捷！
     */
    public static boolean bCheckIfQQFormatLegalUsingRegex(String qq)
    {
        return qq != null && qq.matches("[1-9]\\d{5,19}");
    }

    public static boolean bCheckIfQQFormatLegal(String qq) {
        // 1、判断qq号码是否为空
        if (qq == null || qq.trim().isEmpty() || qq.startsWith("0") || qq.length() < 6 || qq.length() > 20) {
            return false;
        }

        // 2、qq号码至少不为空；不以0作开头；满足6-20位长度
        // 判断qq号码中是否都是数字
        for (int i = 0; i < qq.length(); i++) {
            // 根据索引提取当前位置处的字符
            char ch = qq.charAt(i);
            // 判断 ch 记住的字符，但凡有一个不是数字，则qq号码不合法
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        // 能走到这一步，说明qq号码肯定是合法的！
        return true;
    }
}
