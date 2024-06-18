package com.yangtze.codeBlock;

public class TEST {
    public static void main(String[] args) {
        /*
        代码块概述
        代码块是类的5大成分之一（成员变量、构造器、方法、代码块、内部类）
        代码块分为2种
            静态代码块
                格式：static{}
                特点：类加载时自动执行，由于类只会加载一次，所以静态代码块也只会执行一次
                作用：完成类的初始化，例如：对类变量的初始化赋值
            实例代码块
                格式：{}
                特点：每次创建对象时，执行实例化代码，并在构造器前执行。
                作用：和构造器一样，都是用来完成对象的初始化的，例如：对实例变量进行初始化
        **/

        /*System.out.println(Student.number);
        System.out.println(Student.number);
        System.out.println(Student.number);
        System.out.println(Student.schoolName);*/

        Student s1 = new Student();
        System.out.println(s1.getAge());
        Student s2 = new Student("MIKE");
        System.out.println(s2.getAge());
    }
}
