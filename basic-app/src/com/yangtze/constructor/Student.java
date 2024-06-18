package com.yangtze.constructor;

public class Student {
    String name;
    double score;

    // 无参构造器
    public Student() {
        System.out.println("无参构造器被触发执行了！");
    }

    // 有参构造器
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
        System.out.println("有参构造器被触发执行了！");
    }

    /*构造器注意事项*/
    // 类在设计时，如果不写构造器，Java会为类自动生成一个无参构造器的
    // 一旦定义了有参数构造器，Java就不会帮我们的类自动生成无参构造器了，此时就建议自己手写一个无参构造器出来了
}
