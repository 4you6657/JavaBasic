package com.yangtze.sortAlgorithms;

import java.util.Arrays;

public class popSort {
    public static void main(String[] args) {
        /*
            冒泡排序的思想：每次从数组中找出最大值放在数组的后面去。
         */

        int[] arr = {5, 2, 3, 1};
        int[] arrPopSorted = popSort(arr);
        System.out.println(Arrays.toString(arrPopSorted));
    }

    /*
        实现冒泡排序的关键步骤分析
            + 确定总共需要做几轮：数组的长度 - 1
            + 每轮比较几次：数组的长度 - 轮数 - 1
            + 当前位置大于后一个位置则交换数据
     */
    public static int[] popSort(int[] arr) {
        // 定义一个循环，控制总共排几轮？
        for (int i = 0; i < arr.length - 1; i++) {
            // 定义一个循环，控制每一轮比较几次？
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 判断当前位置的元素值是否大于后一个位置处的元素值，如果大，则交换位置。
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
