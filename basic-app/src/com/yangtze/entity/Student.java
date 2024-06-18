package com.yangtze.entity;

public class Student {
    // 1、必须私有成员变量，并为每个成员变量提供get(),set()方法
    private String name;
    private double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // 2、 必须为类提供一个公开的无参构造器
    public Student() {

    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }
}