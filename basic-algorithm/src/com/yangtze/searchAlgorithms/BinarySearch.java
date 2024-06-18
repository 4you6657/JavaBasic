package com.yangtze.searchAlgorithms;

import java.util.Arrays;

public class BinarySearch {
    /*
        + 二分查找（折半查找）
            - 前提条件：数组中的数据必须是有序的
            - 核心思想：每次排除一半的数据，查询数据的性能明显提高。
            - 二分查找正常的折半条件应该是开始位置left <= 结束位置 right
     */

    public static void main(String[] args) {
        // 1、准备好一个数组
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int idx = binarySearch(arr, 81);
        System.out.println(idx);

        // Java自带的二分查找算法实现
        System.out.println(Arrays.binarySearch(arr, 81));
        // System.out.println(arr[idx]);
    }

    public static int binarySearch(int[] arr, int data) {
        // 定义2个变量，一个在左边位置，另一个在右边位置
        int leftIdx = 0;
        int rightIdx = arr.length - 1;

        // 定义一个循环，控制折半
        while (leftIdx <= rightIdx) {
            // 3、每次折半，都算出中间位置处的索引
            int midIdx = (leftIdx + rightIdx) / 2;
            // 4、判断当前要找的元素值与中间位置处的元素值大小
            if (data < arr[midIdx]) {
                // 往左边找，截至位置（右边位置） = 中间位置 - 1
                rightIdx = midIdx - 1;
            } else if (data > arr[midIdx]) {
                // 往右边找，起始位置（左边位置） = 中间位置 + 1
                leftIdx = midIdx + 1;
            } else {
                // 中间位置处的元素值，正好等于我们要找的元素值
                return midIdx;
            }
        }
        return -1; // 特殊结果，代表没有找到数据，即数组中不存在该数据！
    }
}
