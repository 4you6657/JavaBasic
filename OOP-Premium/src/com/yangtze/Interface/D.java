package com.yangtze.Interface;

// 实现类必须实现所有接口的所有抽象方法
public class D implements B, C {

    @Override
    public void testB1() {
        System.out.println("testB1方法被调用了~");
    }

    @Override
    public void testB2() {
        System.out.println("testB2方法被调用了~");
    }

    @Override
    public void testC1() {
        System.out.println("testC1方法被调用了~");
    }

    @Override
    public void testC2() {
        System.out.println("testC2方法被调用了~");

    }
}
