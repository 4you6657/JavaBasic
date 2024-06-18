package com.yangtze.codeBlock;

public class Student {

    public Student() {
        System.out.println("无参数构造器执行了~");
    }

    public Student(String name) {
        System.out.println("有参数构造器执行了~");
    }

    static int number = 80;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static String schoolName = "itcast";

    // 静态代码块
    static {
        System.out.println("static静态代码块状态被激活了~");
    }

    // 实例代码块(用的较少)
    {
        System.out.println("实例代码块状态被激活了~");
        // 在实例代码块中对实例变量赋初值是没有什么意义的
        this.age = 20;
    }
}
