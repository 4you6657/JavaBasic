package com.yangtze.Strings.String;

public class StringConstructor {
    public static void main(String[] args) {
        // 直接双引号得到字符串对象，封装字符串数据
        String name = "itheima";
        System.out.println(name);

        // new String 创建字符串对象，并调用构造器初始化字符串
        String str_null = new String(); // 创建一个空白字符串对象，不含有任何内容
        String str = new String("itheima"); // 根据传入的字符串内容来创建字符串对象
        System.out.println(str);

        char[] chars = {'i', 't', 'h', 'e', 'i', 'm', 'a'};
        String str_chars = new String(chars); // 根据字符数组的内容来创建字符串对象
        System.out.println(str_chars);

        byte[] bytes = {97, 98, 99};
        String str_bytes = new String(bytes); // 根据字节数组的内容来创建字符串对象
        System.out.println(str_bytes);


    }
}
