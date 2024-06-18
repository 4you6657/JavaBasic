package com.yangtze.staticKeywordInMethods;

public class Student {

    private double score;

    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }

    public void printHelloJava() {
        System.out.println("Hello Java!");
    }

    public void printIfPass() {
        System.out.println("成绩：" + (this.getScore() >= 60 ? "及格" : "不及格"));
    }

    public Student() {

    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
