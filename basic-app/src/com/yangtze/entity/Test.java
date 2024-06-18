package com.yangtze.entity;

public class Test {
    // 实体类书写要求、特点及应用场景
    // 书写要求：
        // 1、类中的成员变量都私有，并且要对外提供相应的get(),set()方法
        // 2、类中必须要有一个公共的无参构造器
    // 特点：保存实体数据
    // 应用场景：实体类只负责数据存取，而对数据的处理交给其它类来完成，以实现数据和数据业务处理相分离。
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("mike");
        System.out.println(s1.getName());
        s1.setScore(99);
        System.out.println(s1.getScore());

        StudentOperator operator = new StudentOperator(s1);
        operator.printIfPass();

    }
}
