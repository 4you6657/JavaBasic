package com.yangtze.Lambda;

public class Test {
    public static void main(String[] args) {
        /*
            Lambda表达式是JDK8开始新增的一种语法形式；
            作用：用于简化匿名内部类的代码写法
            格式：
            (被重写方法的形参列表)->{
                被重写方法的方法体代码
            };
         */

        /*Animal dog = new Animal() {
            @Override
            public void run() {
                System.out.println("Wolf Run~");
            }
        };
        dog.run();*/

        // 注意：Lambda表达式并不能简化全部匿名内部类的写法，只能简化 函数式接口 的匿名内部类。
        /*
            什么是函数式 接口？
            1、有且仅有一个抽象方法的接口
            2、注意：将来我们见到的大部分 函数式接口，上面都可能会有一个@FunctionalInterface的注解，有该注解的接口就必定是函数式接口
         */

        // 下列代码是错误的，因为Animal是抽象类，而不是函数式接口
        /*Animal dog = () -> {
            System.out.println("Wolf Run~");
        };
        dog.run();*/

        /*Swimming s = new Swimming() {

            @Override
            public void swim() {
                System.out.println("Student swimming~");
            }
        };
        s.swim();*/

        Swimming s = () -> {
            System.out.println("Student swimming~");
        };
        s.swim();
    }
}

interface Swimming {
    void swim();
}

abstract class Animal {
    public abstract void run();
}