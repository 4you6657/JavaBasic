package com.yangtze.sortAlgorithms;

import java.util.Arrays;

public class selectSort {
    /*
        选择排序的思想：
            - 每轮选择当前位置，开始找出后面的较小值与该位置交换
     */
    public static void main(String[] args) {
        // 1、准备好一个数组
        int[] arr = {5, 1, 3, 2};
        int[] arrSelectSorted = selectSortRefined(arr);
        System.out.println(Arrays.toString(arrSelectSorted));

    }

    public static int[] selectSort(int[] arr) {
        // 1、控制选择几轮？
        for (int i = 0; i < arr.length - 1; i++) {
            // i = 0 第1轮  j = 1, 2, 3
            // i = 1 第2轮  j = 2, 3
            // i = 2 第3轮  j = 3
            // 2、控制每轮选择几次？
            for (int j = i + 1; j < arr.length; j++) {
                // 判断当前位置处的元素值是否大于后面位置处的元素值，若大于则交换
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;
    }

    public static int[] selectSortRefined(int[] arr) {
        // 1、控制选择几轮？
        for (int i = 0; i < arr.length - 1; i++) {
            // i = 0 第1轮  j = 1, 2, 3
            // i = 1 第2轮  j = 2, 3
            // i = 2 第3轮  j = 3
            int minIdx = i;
            // 2、控制每轮选择几次？
            for (int j = i + 1; j < arr.length; j++) {
                // 判断当前位置处的元素值是否大于后面位置处的元素值，若大于则交换
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            // 决定是否交换？
            if (i != minIdx) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
