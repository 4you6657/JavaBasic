package com.yangtze.catchExceptionAndTryToRepair;

import java.util.Scanner;

public class Test {
    /*
        捕获异常,尝试修复
     */
    public static void main(String[] args) {
        // 调用方法,用户输入一个合适的价格
        while (true) {
            try {
                System.out.println(getProperPrice());
            } catch (Exception e) {
                System.out.println("请您输入合法的数字！");
                // throw new RuntimeException(e);
            }
        }

    }

    public static double getProperPrice() {
        System.out.println("请输入您的价格");
        Scanner sc = new Scanner(System.in);
        while (true) {
            double price = sc.nextDouble();
            if (price >= 0) {
                return price;
            } else {
                System.out.println("您输入的价格不合适！");
            }
        }

    }
}
