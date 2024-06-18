package com.yangtze.normalInnerClass;

public class TEST {
    public static void main(String[] args) {
        /**
         * 内部类
         * 是类中的五大成分之一（成员变量、方法、构造器、内部类 、代码块），如果一个类定义在另一个类的内部，这个类就是内部类。
         * 场景：当一个类的内部，包含了一个完整的事物，且这个事物没有必要单独设计时，就可以把这个事物设计成内部类
         *
         * 4种形式：成员内部类、静态内部类、局部内部类、匿名内部类(重点)
         */

        // 成员内部类对象的创建
        /**
         * 成员内部类：就是类中的一个普通成员，类似普通成员变量、成员方法
         * 对象的创建：Car.Engine engine = new Car().new Engine();
         */
        Car.Engine engine = new Car().new Engine();
        engine.test();
    }

}
