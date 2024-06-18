package com.yangtze.polymorphism;

public class Student extends People{

    public String name = "STUDENT";
    @Override
    public void run(){
        System.out.println("Run fast~");
    }

    public void test(){
        System.out.println("考试");
    }
}
