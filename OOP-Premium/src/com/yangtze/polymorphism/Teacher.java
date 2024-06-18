package com.yangtze.polymorphism;

public class Teacher extends People {
    public String name = "TEACHER";
    @Override
    public void run() {
        System.out.println("Run Slowly~");
    }

    public void teach(){
        System.out.println("教书");
    }
}
