package com.yangtze.File.prevKnowledge;

public class Calc {
    public static void main(String[] args) {
        // 计算N的阶乘
        System.out.println(calculate(5));
        System.out.println(add(5));
    }

    public static int calculate(int N) {

        if (N == 1) {
            // 终止条件
            return 1;
        }
        return N * calculate(N - 1);
    }

    public static int add(int N) {
        if (N == 1) {
            // 终止条件
            return 1;
        }
        return N + add(N - 1);
    }
}
