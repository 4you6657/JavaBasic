package com.yangtze.StreamMethods;

import java.util.*;
import java.util.stream.Stream;

public class GetStream {
    public static void main(String[] args) {
        /*
        1、获取Stream流( public interface Stream<T> ... {} )
            常用方法：
                - 获取集合的Stream流
                    + Collection提供的方法：default Stream<E> stream() | 说明：获取当前集合对象的Stream流
                - 获取数组的Stream流
                    + Arrays类提供的方法：public static<T> Stream<T> stream(T[] array) | 说明：获取当前数组的Stream流
                    + Stream类提供的方法：public static<T> Stream<T> of(T... values) | 说明：获取当前接收数据的Stream流
        2、调用Stream流常见的中间方法(支持链式编程)
        3、获取处理的结果(调用一些Stream流常用的终结方法)
            常用方法：
                -
         */

        // 1、如何获取List集合的Stream流？
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张无忌", "周芷若", "赵敏", "张强");
        Stream<String> listStream = names.stream();

        // 2、如何获取Set集合的Stream流？
        Set<String> set = new HashSet<>();
        Collections.addAll(set, "刘德华", "张曼玉", "张学友", "黎明", "周杰伦", "德玛西亚");
        Stream<String> setStream = set.stream();
        setStream.filter(s -> s.contains("德")).forEach(s -> System.out.println(s));

        // 3、如何获取Map集合的Stream流？
        Map<String, Double> map = new HashMap<>();
        map.put("古力娜扎", 172.3);
        map.put("迪丽热巴", 169.5);
        map.put("马尔扎哈", 176.9);
        map.put("卡尔扎巴", 178.8);

        Set<String> keys = map.keySet();
        Collection<Double> values = map.values();
        Stream<Double> valuesStream = values.stream();

        Set<Map.Entry<String, Double>> entries = map.entrySet();
        Stream<Map.Entry<String, Double>> keyValueStream = entries.stream();
        keyValueStream.filter(keyValueElem -> keyValueElem.getKey().contains("巴"))
                .forEach(elem -> System.out.println((elem.getKey() + "-->" + elem.getValue())));


        // 4、如何获取数组的Stream流？
        String[] str = {"张翠山", "东方不败", "堂大山", "独孤求败"};
        Stream<String> streamUsingArraysMethod = Arrays.stream(str);
        Stream<String> streamUsingStreamMethod = Stream.of(str);


    }
}
