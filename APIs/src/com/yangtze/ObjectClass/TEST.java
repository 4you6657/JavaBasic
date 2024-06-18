package com.yangtze.ObjectClass;

public class TEST {
    public static void main(String[] args) {
        Student s1 = new Student("赵敏", 85.0, 23);
        // System.out.println(s1.toString());
        System.out.println(s1);

        Student s2 = new Student("张三", 90.0, 20);
        Student s3 = new Student("赵敏", 85.0, 23);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);



    }
}
