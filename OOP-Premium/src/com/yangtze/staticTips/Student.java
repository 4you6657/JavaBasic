package com.yangtze.staticTips;

public class Student {

    public static String schoolName; // 类变量

    private double score; // 实例成员

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // 1、类方法中可以直接访问类的成员，不可以直接访问实例成员
    public static void printHelloWorld()
    {
        // 1、同一个类中，访问类成员，类名可以省略不写
        Student.schoolName = "itheima";
        Student.PrintHelloJava();

        schoolName = "itcast";
        PrintHelloJava();

        // System.out.println(score); // 报错！
        // printIfPass(); // 报错！
    }

    public static void PrintHelloJava()
    {
        System.out.println("Hello Java!");
    }



    // 2、实例方法中既可以直接访问类成员，也可以直接访问实例成员
    public void printIfPass()
    {
        schoolName = "itheima school";
        printHelloWorld();
        System.out.println("pass!");
        System.out.println(score); // this可以省略不写
        System.out.println(this.score);
        System.out.println(this.getScore());
        printOK();
        this.printOK();
        System.out.println(this); // 谁调用printIfPass()方法，this就指向谁。
    }

    public void printOK()
    {
        System.out.println("ok");
    }

    // 3、实例方法中可以出现this关键字，类方法中不可以出现this关键字
}
