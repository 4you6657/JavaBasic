package com.yangtze.generics.genericsClass;

public class Test {
    public static void main(String[] args) {
        // 泛型类的定义和使用
        MyArrayList<String> list = new MyArrayList<>();
        list.add("MIKE");
        String result = list.get(0);
        System.out.println(result);

        MyClass<String, String> c = new MyClass<String, String>();
        c.put("MIKE", "MALE");

        MyClass<Cat, Dog> c2 = new MyClass<>();
        c2.put(new Cat(), new Dog());

        AnimalSubClass<Cat> c3 = new AnimalSubClass<>();
        AnimalSubClass<Dog> d = new AnimalSubClass<>();
    }
}
