package com.yangtze.extendOverride;

public class B extends A {
    // 方法重写
    @Override
    public void print(){
        System.out.println("父类的print()方法被重写~");
    }
    @Override
    public void print(int previous, int current){
        System.out.println("父类中的print(int previous, int current)方法被重写~");
    }
}
