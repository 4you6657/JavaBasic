package com.yangtze.staticInnerClass;

public class Outer {
    private int age;
    public static String schoolName;

    // 静态内部类
    public static class Inner {
        private String name;
        public static int number;

        public void test01() {
            System.out.println(schoolName);
            System.out.println(this.name);
            // System.out.println(age); 报错！
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void test02() {
        System.out.println(schoolName);
        // System.out.println(age); 报错！
    }
}
