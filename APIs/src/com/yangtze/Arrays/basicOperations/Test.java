package com.yangtze.Arrays.basicOperations;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class Test {
    public static void main(String[] args) {
//        1、public static String toString(类型[] arr)：返回数组的内容
        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(arr));
//        2、public static 类型[] copyOfRange(类型[]  arr, 起始索引, 结束索引)：拷贝数组（指定范围，包前不包后）
        // System.out.println(Arrays.copyOfRange(arr, 1, 4));
        int[] copyArr = Arrays.copyOfRange(arr, 1, 4);
//        3、public static copyOf(类型[]  arr, int  newLength)：拷贝数组，可以指定数组长度(新位置默认用0填充)
        int[] copyWithNewLength = Arrays.copyOf(arr, 20);
        System.out.println(Arrays.toString(copyWithNewLength));
//        4、public static setAll(double[] array, IntToDoubleFunction generator)：把数组中的原数据改为新数据又存进去
        double[] prices = {99.8, 128, 100};

        // 把所有的价格都打八折，然后又存进去

        /*Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int valueIdx) {
                return prices[valueIdx] * 0.8;
            }
        });*/

        // 简化以后的版本
        /*Arrays.setAll(prices, (int valueIdx) -> {
            return prices[valueIdx] * 0.8;
        });*/
        // 再度简化后的版本
        /*
            Lambda表达式的省略规则（进一步简化Lambda表达式的写法）
            1、参数类型可以省略不写
            2、如果只有一个参数，参数类型可以省略，同时()也可以省略
            3、如果Lambda表达式中的方法体代码只有一行代码，可以省略大括号不写，同时要省略分号！
                此时，如果这行代码是return语句，也必须去掉return不写
         */
        Arrays.setAll(prices, valueIdx -> prices[valueIdx] * 0.8);

        System.out.println(Arrays.toString(prices));
//        5、public static void sort(类型[] arr)：对数组进行排序（默认是升序排序）
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
    }
}
