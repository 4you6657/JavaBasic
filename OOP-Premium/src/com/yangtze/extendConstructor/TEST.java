package com.yangtze.extendConstructor;

public class TEST {
    public static void main(String[] args) {
        Player enermy = new Player("MIKE", 3.1415926, "PUSH");

        System.out.println(enermy.getName());
        System.out.println(enermy.getPosition());
        System.out.println(enermy.getSkill());

        // 子类构造器的特点：子类的全部构造器，都会先调用父类的构造器，再执行自己。
        // 子类构造器是如何实现调用父类构造器的
        // 默认情况下，子类全部构造器的第一行代码都是super()[默认存在的]，它会调用父类的无参数构造器
        // 如果父类没有无参数构造器，则我们必须在子类构造器的第一行手写super(...)，指定去调用父类的有参数构造器
    }
}
