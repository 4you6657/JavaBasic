package com.yangtze.charSet;

public class UnicodeCharSet {
    public static void main(String[] args) {
        /*
            Unicode字符集（统一码，也叫万国码）
                - Unicode是国际组织制定的，可以容纳世界上所有文字、符号的字符集。
                - UTF-32 : 4个字节表示1个字符，存储占用过于“奢侈！”，导致通信效率变低。

                - UTF-8: 是Unicode字符集的一种编码方案，采取可变长编码方案，总共分4个长度区：1个字节，2个字节，3个字节，4个字节。
                    + 英文字符、数字等只占一个字节（兼容标准ASCII编码），汉字字符占用3个字节。
                  + UTF-8 编码方式（2进制）
                    0xxxxxxx (ASCII码)
                    110xxxxx 10xxxxxx （2字节）
                    1110xxxx 10xxxxxx 10xxxxxx （3字节）
                    11110xxx 10xxxxxx 10xxxxxx 10xxxxxx （4字节）

                    技术人员在开发时都应该使用UTF-8编码！

                    注意事项
                        - 字符编码时使用的字符集，和解码时使用的字符集必须一致，否则会出现乱码
                        - 英文，数字一般不会乱码，因为很多字符集都兼容了ASCII编码
         */
    }
}
