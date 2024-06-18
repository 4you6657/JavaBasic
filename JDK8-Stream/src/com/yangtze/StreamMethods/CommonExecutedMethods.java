package com.yangtze.StreamMethods;

import java.util.*;
import java.util.stream.Collectors;

public class CommonExecutedMethods {
    /*
        Stream流常见的终结方法
            - 终结方法是指调用完成以后，不会返回新Stream了，没法继续使用流了。

                + void forEach(Consumer action)                    : 对此流运算后的元素执行遍历
                + long count()                                     : 统计此流运算后的元素个数
                + Optional<T> max(Comparator<? super T> comparator): 获取此流运算后的最大值元素
                + Optional<T> min(Comparator<? super T> comparator): 获取此流运算后的最小值元素
     */
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Collections.addAll(students,
                new Student("蜘蛛精", 26, 172.5),
                new Student("蜘蛛精", 26, 172.5),
                new Student("紫霞", 23, 167.6),
                new Student("白晶晶", 25, 169.0),
                new Student("牛魔王", 35, 183.3),
                new Student("牛夫人", 34, 168.5)
        );

        // 需求1：请计算出身高超过168的学生有几人？
        System.out.println(students.stream().filter(student -> student.getHeight() > 168.0).count());

        System.out.println("=== === === === === ===");

        // 需求2：请找出身高最高的学生对象，并输出
        Student s = students.stream().max((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight())).get();
        System.out.println(s);

        System.out.println("=== === === === === ===");

        // 需求3：请找出身高最矮的学生对象，并输出
        Student ss = students.stream().min((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight())).get();
        System.out.println(ss);

        System.out.println("=== === === === === ===");


        /*
            收集Stream流：就是把Stream流操作后的结果转回到集合或者数组中去返回
            Stream流：方便操作集合/数组的手段；
                        把从Stream流中收集的数据放到一个新的集合/数组当中传给别人才是最终目的
            Stream提供的常用终结方法
                - R collect(Collector collector):   把流处理后的结果收集到一个指定的集合中去
                - Object[] toArray():   把流处理后的结果收集到一个数组中去
         */
        // 需求4：请找出身高超过170的学生对象，并放到一个新集合中去返回
        // Stream流只能收集一次，不能再次被收集。
        // List<Student> studentList = students.stream().filter(student -> student.getHeight() > 170.0).collect(Collectors.toList());
        List<Student> studentList = students.stream()
                .filter(student -> student.getHeight() > 170.0)
                .toList();
        studentList.forEach(System.out::println);

        System.out.println("=== === === === === ===");

        // Set集合会自动去重
        Set<Student> studentSet = students.stream()
                .filter(student -> student.getHeight() > 170.0)
                .collect(Collectors.toSet());
        studentSet.forEach(System.out::println);
        System.out.println("=== === === === === ===");

        // 需求5：请找出身高超过170的学生对象，并把学生对象的名字和身高，存入到一个Map集合返回
        // Map不支持自动去除重复的key
        // students.stream().filter(student -> student.getHeight() > 170.0).collect(Collectors.toMap(student -> student.getName(), student -> student.getHeight()));
        Map<String, Double> mapNameAndHeight = students.stream()
                .filter(student -> student.getHeight() > 170.0)
                .distinct()
                .collect(Collectors.toMap(Student::getName, Student::getHeight));
        System.out.println(mapNameAndHeight);
        System.out.println("=== === === === === ===");

        // Object[] objects = students.stream().filter(student -> student.getHeight() > 170.0).toArray();
        // Student[] objects = students.stream().filter(student -> student.getHeight() > 170.0).toArray(len -> new Student[len]);
        Student[] objects = students.stream().filter(student -> student.getHeight() > 170.0).toArray(Student[]::new);
        System.out.println(Arrays.toString(objects));
    }
}
