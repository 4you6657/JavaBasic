package com.yangtze.rules;

public class Test {
    public static void main(String[] args) {
        /*
            String类提供了一个匹配正则表达式的方法
            public boolean matches(String regex)    :   判断字符串是否匹配正则表达式，匹配返回true，不匹配返回false
         */

        /*
            1、字符类（只能匹配单个字符）
            [abc]           :   只能匹配a,b,c
            [^abc]          :   不能是a,b,c
            [a-zA-z]        :   只能是a-z A-Z的字符
            [a-z&&[^bc]]    :   a-z, 除了b,c
            [a-zA-Z0-9]     :   只能是a-z A-Z 0-9的字符
         */

        /*
            2、预定义字符（只能匹配单个字符）   .   \d    \D  \s  \S  \w  \W
                .   :   可以匹配任意字符
                在Java中， 反斜杠（\） 是有特殊用途的，例如（\n）表示换行, （\t）表示一个缩进, ...

                \s      :   代表一个空白字符
                \S      :   代表一个非空白字符
                \w      :   等价于[a-zA-Z_0-9]
                \W      :   等价于[^\w],即不能是 a-zA-Z_0-9
            注意：以上预定义字符都只能匹配单个字符
         */


        /*
        3、数量词
            ?       : 出现0次或1次
            *       : 出现0次或多次
            +       : 出现1次或多次
            {n}     : 正好出现n次
            {n, }   : 至少出现n次
            {n, m}  : n到m次(n<=出现次数<=m)
         */
        System.out.println("a".matches("\\w?")); // ? 代表0次或1次


        /*
        4、其他几个常用的符号：（?i） 忽略大小写 、 或：（|） 、 分组：()
         */
    }
}
