package com.yangtze.Strings.StringBuilder;

public class Test {
    public static void main(String[] args) {
        /*
            StringBuilder代表可变字符串对象，相当于是一个容器，它里面装的字符串是可以改变的，就是用来操作字符串的。
            好处：StringBuilder比String更适合做字符串的修改操作，效率会更高，代码也会更简洁。
         */
    // StringBuilder builder = new StringBuilder("itheima");
    StringBuffer builder = new StringBuffer("itheima");
        // 1、拼接内容
        builder.append(12);
        builder.append("-itcast");
        builder.append(true);
        System.out.println(builder);

        // 2、支持链式编程
        builder.append(666).append(777).append(888);
        System.out.println(builder);

        // 3、反转操作
        builder.reverse();
        System.out.println(builder);

        // 4、返回字符串的长度
        System.out.println(builder.length());

        // 5、把StringBuilder对象又转换成String类型
        String str = builder.toString();
        System.out.println(str);

        /*
            对于字符串相关的操作，如频繁的拼接、修改等，建议使用StringBuilder，效率更高
            如果操作字符串较少，或者不需要操作，以及定义字符串变量，还是建议用String
         */


        /*
        StringBuffer和StringBuilder的用法是一模一样的
            但是StringBuffer是线程安全的，StringBuilder是线程不安全的
         */
    }
}
