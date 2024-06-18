package com.yangtze.encapsulation;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setScore(-99);
        s1.setScore(99);
        System.out.println(s1.getScore());

        s1.printIfPass();
    }
}
