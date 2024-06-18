package com.yangtze.extend;

public class A {
    // 公开成员
    public int number;
    public void printNumber()
    {
        System.out.println(this.number++);
    }

    public A()
    {
        System.out.println("A的无参构造被调用了~");
    }

    // 私有成员
    private String name;
    private void printHelloWorld()
    {
        System.out.println("Hello World!");
    }
}
