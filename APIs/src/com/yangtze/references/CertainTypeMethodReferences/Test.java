package com.yangtze.references.CertainTypeMethodReferences;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

    /*
        + 掌握特定类型的方法引用
            - 类型::方法
        + 使用场景
            - 如果某个Lambda表达式里只是调用一个实例方法，并且前面参数列表中的第一个参数是作为方法的主调，
                后面的所有参数都是作为该实例方法的入参，则此时就可以使用特定类型的方法引用。
     */
    public static void main(String[] args) {
        String names[] = {"bob", "angela", "andy", "deli", "Cacao", "Baby", "jack", "Citi"};

        // 进行排序(默认按照字符串首字符对应的ASCII编号值进行升序排列)
        // Arrays.sort(names);

        /*
            要求忽略首字符大小写进行排序
         */
        /*Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 制定比较规则：o1 = "Andy" o2 = "angela"
                // 忽略大小写比较排序
                return o1.compareToIgnoreCase(o2);
            }
        });*/

        // Lambda表达式简化
        // Arrays.sort(names, (o1, o2) -> o1.compareToIgnoreCase(o2));
        // 特定类型的方法引用对Lambda表达式进行再简化
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));
    }
}
