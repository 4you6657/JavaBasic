package com.yangtze.normalInnerClass;

public class Car {
    private String name;
    private double price;

    private int days = 32;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // 成员内部类
    public class Engine {
        private String name;
        private double price;

        private int days = 64;

        // public static String producer = "XIAOMI"; // JDK 16开始才支持定义静态成员

        public void test() {
            System.out.println(this.name);
            System.out.println(this.price);
            // System.out.println(producer);
            int days = 128;

            /* ******************************* */
            System.out.println(days);           // 128
            System.out.println(this.days);      // 64
            System.out.println(Car.this.days);  // 32
            /* ******************************* */
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    public class Wheel {

    }
}
