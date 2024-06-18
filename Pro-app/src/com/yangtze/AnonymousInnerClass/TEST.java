package com.yangtze.AnonymousInnerClass;

public class TEST {
    public static void main(String[] args) {
        /*
            匿名内部类
            + 就是一种特殊的局部内部类；所谓匿名：指的是程序员不需要为这个类声明名字
            + 特点：匿名内部类本质就是一个子类，并会立即创建出一个子类对象
            + 作用：用于更方便的创建一个子类对象
         */
//        Animal cat = new Cat();
//        cat.cry();

        // 1、把这个匿名内部类编译成一个子类，然后会立即创建一个子类对象出来。
        Animal cat = new Animal() {
            @Override
            public void cry() {
                System.out.println("Meow~");
            }
        };
        cat.cry();
    }
}

abstract class Animal {
    public abstract void cry();
}

//class Cat extends Animal{
//    @Override
//    public void cry() {
//        System.out.println("Meow~");
//    }
//}

class Dog extends Animal {
    @Override
    public void cry() {
        System.out.println("Wolf~");
    }
}