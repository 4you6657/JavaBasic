package com.yangtze.staticInnerClass;

public class TEST {
    public static void main(String[] args) {
        /*
         * 静态内部类：
         * 有static修饰的内部类，属于外部类自己持有。
         */


        /*
         * 静态内部类中访问外部类成员的特点
         * 可以直接访问外部类的静态成员，不可以直接访问外部类的实例成员(对象成员)
         */

        // 静态内部类创建对象的格式
        Outer.Inner in = new Outer.Inner();
        in.setName("inner");
        System.out.println(in.getName());
    }
}
