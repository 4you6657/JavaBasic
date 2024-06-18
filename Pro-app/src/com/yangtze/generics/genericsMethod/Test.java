package com.yangtze.generics.genericsMethod;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 泛型方法
        String result = test("Java");
        System.out.println(result);
        Dog dog = test(new Dog());
        System.out.println(dog);


        // 需求：所有汽车可以一起参加比赛
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new BMW());
        cars.add(new Benci());
        startGame(cars);

        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        startGame(bmws);

        ArrayList<Benci> bencis = new ArrayList<>();
        bencis.add(new Benci());
        bencis.add(new Benci());
        startGame(bencis);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        // startGame(dogs);

    }

    // ?：通配符，可以在“使用泛型”的时候代表一切类型；E、T、K、V是在定义泛型的时候使用
    // 泛型的上下限
    // ? extends Car (泛型上限)：?能接收的必须是Car或者其子类
    // ? super Car (泛型下限)：?能接收的必须是Car或者其父类
    public static void startGame(ArrayList<? extends Car> cars) {

    }


//    public static <T extends Car> void startGame(ArrayList<T> cars) {
//
//    }

    public static <T> T test(T t) {
        return t;
    }
}
