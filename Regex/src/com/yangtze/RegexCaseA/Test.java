package com.yangtze.RegexCaseA;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // checkIsPhoneLegal();
        checkIsEMailLegal();
    }

    public static void checkIsPhoneLegal() {
        while (true) {
            System.out.println("请输入电话号码(手机|座机)");
            Scanner sc = new Scanner(System.in);
            String phone = sc.nextLine();
            // 18676769999 010-3424242424 0104644535

            // 手机号码的正则表达式
            if (phone.matches("(1[3-9]\\d{9}) | (0\\d{2,7}-?[1-9]\\d{4,19})")) {
                System.out.println("格式正确~");
                break;
            } else {
                System.out.println("格式有误！");
            }
        }
    }

    public static void checkIsEMailLegal() {
        while (true) {
            System.out.println("请输入邮箱地址");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            // 校验邮箱的正则表达式
            if (email.matches("\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2}")) {
                System.out.println("格式正确~");
                break;
            } else {
                System.out.println("格式有误！");
            }
        }
    }
}
