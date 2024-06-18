package com.yangtze.charSet;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CodeAndDecode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
            字符集的编码、解码操作
         */

        String data = "YangtzeUniversity长江大学";


        // Java代码完成对字符的编码
        // 1、byte[] getBytes():   使用平台的默认字符集将该String编码为一系列字节，将结果存储到新的字节数组中。
        byte[] bytes = data.getBytes(); // 默认UTF-8进行编码
        // System.out.println(Arrays.toString(bytes));
        // System.out.println(bytes.length);

        // 2、byte[] getBytes(String charsetName):   使用指定的字符集将该String编码为一系列字节，将结果存储到新的字节数组中。
        byte[] gbks = data.getBytes("GBK");
        // System.out.println(Arrays.toString(gbks));

        // Java代码完成对字符的解码
        // 1、String(byte[] bytes):    通过使用平台的默认字符集编码指定的字节数组来构造新的 String
        String utf8S = new String(bytes); // 默认编码UTF-8解码
        System.out.println(utf8S);

        // 2、String(byte[] bytes,  String charsetName):   通过指定的字符集解码指定的字节数组来构造新的 String
        String gbkS = new String(gbks, "GBK");
        System.out.println(gbkS);

    }
}
