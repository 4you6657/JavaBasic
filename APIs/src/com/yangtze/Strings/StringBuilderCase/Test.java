package com.yangtze.Strings.StringBuilderCase;

public class Test {
    public static void main(String[] args) {
        System.out.println(getArrayData(new int[]{11, 22, 33}));
    }

    public static String getArrayData(int[] arr) {
        if (arr == null) {
            return null;
        }

        // 2、arr数组存在，arr = [11, 22, 33]
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                builder.append(arr[i]);
            } else {
                builder.append(arr[i]).append(", ");
            }

        }
        builder.append("]");
        return builder.toString();
    }
}
