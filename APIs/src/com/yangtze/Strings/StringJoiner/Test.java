package com.yangtze.Strings.StringJoiner;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        /*
            StringJoiner: JDK8开始新增的，跟StringBuilder一样，也是用来操作字符串的，也可以看成是一个容器，创建之后里面的内容是可变的。
            好处：不仅能提高字符串的操作效率，并且在有些场景下使用它操作字符串，代码会更简洁
         */

        StringJoiner sj = new StringJoiner(", ");
        sj.add("Java");
        sj.add("C++");
        sj.add("C#");
        sj.add("Go");
        System.out.println(sj.toString());
        System.out.println(getArrayData(new int[]{11, 22, 33}));
    }

    public static String getArrayData(int[] arr) {
        if (arr == null) {
            return null;
        }

        // 2、arr数组存在，arr = [11, 22, 33]
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }
        return sj.toString();
    }
}
