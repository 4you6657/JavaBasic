package com.yangtze.generics;

import java.util.ArrayList;

public class Test {
    /*
        泛型：定义类、接口、方法时，同时声明了一个或者多个类型变量（如：<E>），称为泛型类、泛型接口、泛型方法，它们统称为泛型
        作用：泛型提供了在编译阶段约束所能操作的数据类型，并自动进行检查的能力！这样可以避免强制类型转换，及其可能出现的异常
        泛型的本质：把具体的数据类型作为参数传递给类型变量
     */
    public static void main(String[] args) {
        ArrayList<Cat> list = new ArrayList<Cat>();
        list.add(new Cat());
        for (Cat cat : list) {
            System.out.println(cat);
        }

        ArrayList<String> strList = new ArrayList<String>();
        strList.add("C++");
        for (String s : strList) {
            System.out.println(s);
        }
    }
}

class Cat {

}
