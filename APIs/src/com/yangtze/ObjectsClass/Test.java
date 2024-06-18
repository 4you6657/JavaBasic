package com.yangtze.ObjectsClass;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        /*
            Objects是一个工具类，提供了很多操作对象的静态方法给程序员使用。
            public static boolean equals(Object a, Object b)    :   先做非空判断，再比较两个对象
            public static boolean isNull(Object obj)            :   判断对象是否为null，为null返回true，反之false
            public static boolean nonNull(Object obj)           :   判断对象是否不为null，不为null返回true，反之false
         */

        String s1 = "itcast";
        String s2 = null;

        // System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1, s2)); // 更加安全
        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.isNull(s2));
        System.out.println(Objects.nonNull(s1));
        System.out.println(Objects.nonNull(s2));
    }
}
