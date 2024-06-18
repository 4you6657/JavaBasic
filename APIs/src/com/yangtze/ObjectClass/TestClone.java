package com.yangtze.ObjectClass;

public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 对象克隆: protected Object clone();
        User u1 = new User(1, "张三", "123456", new double[]{99.0, 98.0});
        System.out.println(u1.getId());
        System.out.println(u1.getUsername());
        System.out.println(u1.getPassword());
        System.out.println(u1.getScores());
        System.out.println("+++++++++++++++++++++");
        Object o = u1.clone();
        User u2 = (User) o;
        System.out.println(u2.getId());
        System.out.println(u2.getUsername());
        System.out.println(u2.getPassword());
        System.out.println(u2.getScores());
    }
}
