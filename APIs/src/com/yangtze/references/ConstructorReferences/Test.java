package com.yangtze.references.ConstructorReferences;

public class Test {
    public static void main(String[] args) {
        /*
            - 构造器引用
                + 类名::new
            - 使用场景
                + 如果某个Lambda表达式里只是在创建对象，并且前后参数情况一致，就可以使用构造器引用
         */

        // 1、创建接口的匿名内部类对象
        /*createCarInstance cci = new createCarInstance() {

            @Override
            public Car create(String name, double price) {
                return new Car(name, price);
            }
        };*/
        // Car c = cci.create("BMW", 49.9);
        // System.out.println(c);

        // 利用Lambda表达式规则对上述代码进行初步简化
        // createCarInstance cci = (name, price) -> new Car(name, price);
        // Car c = cci.create("BMW", 49.9);
        // System.out.println(c);

        // 使用构造器引用对简化后的代码进行再简化
        createCarInstance cci = Car::new;
        Car c = cci.create("BMW", 49.9);
        System.out.println(c);
    }
}


interface createCarInstance {
    Car create(String name, double price);
}