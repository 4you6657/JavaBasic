package com.yangtze.Arrays.ObjectSortDefine;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {


        Student[] students = new Student[4];
        students[0] = new Student("A", 169.5, 23);
        students[1] = new Student("B", 163.8, 26);
        students[2] = new Student("C", 163.8, 26);
        students[3] = new Student("D", 167.5, 24);

        // 1、public static void sort(类型[] arr) : 对数组进行排序
//        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));

        // 如果数组中存储的是对象，如何排序？
        // 方式1：让该对象的类实现Comparable(比较规则)的接口，然后重写compareTo方法，自己制定比较规则

        // 方式2：使用下面的sort方法，创建Comparable比较器接口的匿名内部类对象，然后自己制定比较规则
        // public static<T> void sort(T[] arr, Comparator<? super T> c) 对数组进行排序（支持自定义排序规则）
        // 参数1：需要排序的数组； 参数2：Comparator比较器对象（用来制定对象的比较规则）
        /*Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 约定1：左边对象 > 右边对象，请您返回正整数
                // 约定2：左边对象 < 右边对象，请您返回负整数
                // 约定3：左边对象 = 右边对象，请您返回0
                // 按照年龄升序排序

                // 方式1：（有缺陷）
                // return (o1.getAge() - o2.getAge());
                // return (int) (o2.getHeight() - o1.getHeight());

                // 方式2：老老实实写判断语句
                *//*if (o1.getHeight() > o2.getHeight())
                {
                    return 1;
                }
                else if (o1.getHeight() < o2.getHeight())
                {
                    return -1;
                }
                else
                {
                    return 0;
                }*//*

                // 方式3：包装类Double
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });*/

        /*Arrays.sort(students, (Student o1, Student o2) -> {
            return Double.compare(o1.getHeight(), o2.getHeight());
        });*/

        // 极简版本
        Arrays.sort(students, (o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight()));

        System.out.println(Arrays.toString(students));


    }


}
