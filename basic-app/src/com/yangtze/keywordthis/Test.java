package com.yangtze.keywordthis;

public class Test {
    public static void main(String[] args) {
        // this就是一个变量，可以用在方法中，来拿到当前对象
        // 哪个对象调用方法，this就指向哪个对象，也就是拿到哪个对象
        // this的应用场景 — 主要用来解决对象的成员变量与方法内部变量的名称一致时，导致的访问冲突问题
        Student s1 = new Student();
        System.out.println(s1);
        s1.printThis();

        Student s2 = new Student();
        System.out.println(s2);
        s2.printThis();
        s2.printThisActualImplement();


        Student s3 = new Student();
        System.out.println(s3);
        s3.printThis();
        s3.printThisActualImplement();
        s3.score = 750;
        s3.printPass(600);
    }

}
