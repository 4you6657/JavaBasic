package com.yangtze.NewFeatures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    /*
        Stream：也叫Stream流，是JDK8开始新增的一套API (java.util.stream.*)，可以用于操作集合或者数组的数据。
        优势：Stream流大量的结合了Lambda的语法风格来编程，提供了一种更加强大、更加简单的方式操作集合或者数组中的数据，代码更简洁，可读性更好。

        Stream流的使用步骤：
            - 数据源(集合/数组/...)
            - 获取Stream流：Stream流代表一条流水线，并能与数据源建立连接
            - 调用流水线的各种方法：对数据进行处理、计算(过滤、排序、去重...)
            - 获取处理的结果：遍历、统计、收集到一个新集合中返回
     */


    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张无忌", "周芷若", "赵敏");
        System.out.println(names);

        // 找出姓张,且是3个字的名字
        // 方法一
        List<String> list = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("张") && name.length() == 3) {
                list.add(name);
            }
        }
        System.out.println(list);

        // 方法二(使用Stream流)
        List<String> result = names.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).collect(Collectors.toList());
        System.out.println(result);
    }
}
