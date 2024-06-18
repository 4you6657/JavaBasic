package com.yangtze.staticKeywordInVariables;

public class Test {
    public static void main(String[] args) {
        // 掌握有无static修饰成员变量的方法
        // 类变量的用法
        Student.name = "袁华";

        // 使用实例对象访问类变量（不推荐）
        Student s1 = new Student();
        s1.name = "马冬梅";

        System.out.println(s1.name);
        System.out.println(Student.name);

        Student s2 = new Student();

        // 2、实例变量的用法：属于每个对象的变量
        s1.age = 23;
        s2.age = 18;

        System.out.println(s1.age);
        System.out.println(s2.age);
    }
}
