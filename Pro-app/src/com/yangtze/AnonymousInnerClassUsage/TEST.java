package com.yangtze.AnonymousInnerClassUsage;

public class TEST {
    public static void main(String[] args) {
        // 匿名内部类的常见使用场景
        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("Wolf Swimming");
            }
        };

        Swimming s2 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("Meow Swimming");
            }
        };

        participate(s1);
        participate(s2);

        // 匿名内部类作为函数参数传递
        participate(new Swimming() {
            @Override
            public void swim() {
                System.out.println("Tiger Swimming");
            }
        });
    }

    // 设计一个方法，可以接收swimming接口的一切实现类对象进来参加游泳比赛。
    public static void participate(Swimming s) {
        s.swim();
    }
}


interface Swimming {
    void swim();
}