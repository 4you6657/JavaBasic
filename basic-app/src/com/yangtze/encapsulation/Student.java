package com.yangtze.encapsulation;


// 什么是封装
// 就是用类设计对象处理某一个事务的数据时，应该把要处理的数据，以及处理这些数据的方法，设计到一个对象中去。
// 封装的设计规范：合理隐藏、合理暴露
public class Student {
    String name;
    private int age;
    private double score;

    public void setScore(double score) {
        if (score < 0 || score > 100) {
            System.out.println("输入数据无效！");
        } else {
            this.score = score;
        }

    }

    public double getScore() {
        return this.score;
    }

    public void printIfPass(){
        System.out.println(this.score > 60 ? "Pass" : "Failed");
    }
    public Student() {

    }

    public Student(String name, int age, double score) {

    }
}
