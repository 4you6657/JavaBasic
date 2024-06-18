package com.yangtze.StreamMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CommonMiddleMethods {
    /*
        Stream流常见的中间方法
            + 中间方法指的是 调用完成后会返回新的Stream流，可以继续使用（支持链式编程）
                - Stream<T> filter(Predicate<? super T> predicate):   用于对流中的数据进行过滤
                - Stream<T> sorted(): 对元素进行升序排序
                - Stream<T> sorted(Comparator<? super T> comparator): 按照指定规则排序
                - Stream<T> limit(long maxSize):  获取前几个元素
                - Stream<T> skip(long n): 跳过前几个元素
                - Stream<T> distinct():   去除流中重复的元素
                - <R> Stream<R> map(Function<? super T,? extends R> mapper):  对元素进行加工，并返回对应的新Stream流
                - static <T> Stream<T> concat(Stream a, Stream b):    合并a和b两个流为一个流
     */


    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores, 88.5, 100.0, 60.0, 99.0, 69.5, 59.9, 99.5, 25.0);

        // 需求1：找出成绩大于等于60分的数据，升序排列后输出。
        // scores.stream().filter(score -> score >= 60).sorted().forEach(elem -> System.out.println(elem));
        scores.stream().filter(score -> score >= 60).sorted().forEach(System.out::println);

        List<Student> students = new ArrayList<>();
        Collections.addAll(students,
                new Student("蜘蛛精", 26, 172.5),
                new Student("蜘蛛精", 26, 172.5),
                new Student("紫霞", 23, 167.6),
                new Student("白晶晶", 25, 169.0),
                new Student("牛魔王", 35, 183.3),
                new Student("牛夫人", 34, 168.5)
        );

        // 需求2：找出年龄>=23且<=30岁的学生，并且按照年龄降序输出
        students.stream()
                .filter(student -> student.getAge() >= 23 && student.getAge() <= 30)
                .sorted(((o1, o2) -> o2.getAge() - o1.getAge()))
                .forEach(System.out::println);

        System.out.println("=== === === === === ===");

        // 需求3：取出身高最高的前3名学生输出
        students.stream()
                .sorted((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight()))
                .limit(3)
                .forEach(System.out::println);

        System.out.println("=== === === === === ===");

        // 需求4：取出身高倒数的2名学生并输出
        students.stream()
                .sorted((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight()))
                .skip(students.size() - 2)
                .forEach(System.out::println);

        System.out.println("=== === === === === ===");

        // 需求5：找出身高超过168的学生的姓名，要求去除重复的名字后再输出
        students.stream()
                .filter(student -> student.getHeight() > 168.0)
                .map(Student::getName) // 对姓名进行加工
                .distinct()  // 去重复
                .forEach(System.out::println);

        System.out.println("=== === === === === ===");

        students.stream()
                .filter(student -> student.getHeight() > 168.0)
                .distinct() // 去重复, 自定义类型的对象（希望内容一样就认为重复，重写hashCode和equals）
                .forEach(System.out::println);

        System.out.println("=== === === === === ===");

        Stream<String> st1 = Stream.of("张三", "李四");
        Stream<String> st2 = Stream.of("张三2", "李四2", "王五");
        Stream<String> concatResult = Stream.concat(st1, st2);
        concatResult.forEach(elem -> System.out.println(elem));
    }
}
