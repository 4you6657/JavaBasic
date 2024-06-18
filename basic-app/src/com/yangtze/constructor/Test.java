package com.yangtze.constructor;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);

        Student s1 = new Student("mike", 85);
        System.out.println(s1.name);
        System.out.println(s1.score);
    }
}
