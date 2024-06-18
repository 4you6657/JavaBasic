package com.yangtze.generics.genericsTips;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        /*
            泛型的擦除问题和注意事项：
                1、泛型是工作在编译阶段的，一旦程序编译成.class文件，.class文件中就不存在泛型了，这就是泛型擦除。
                2、泛型不支持基本数据类型，只支持对象类型(引用数据类型)
         */

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        String result = list.get(0);
        System.out.println(result);

        // ArrayList<int> ints = new ArrayList<int>(); 不支持！只支持引用类型
        ArrayList<Integer> ints = new ArrayList<>();
    }
}
