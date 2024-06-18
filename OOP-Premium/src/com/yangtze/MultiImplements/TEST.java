package com.yangtze.MultiImplements;

public class TEST {
    public static void main(String[] args) {
        System.out.println(666);
    }
}

interface A {
    void test01();
}

interface B {
    void test02();
}

interface C {
    void test03();
}

/**
 * 接口可以多继承
 * 作用：便于实现类去实现
 * 接口其它注意事项
 * 1、一个接口继承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承
 * 2、一个类实现了多个接口，如果多个接口中存在方法签名冲突，则此时不支持多实现
 * 3、一个类继承了父类，又同时实现了接口，父类中和接口中有同名的默认方法，实现类会优先用父类的
 * 4、一个类实现了多个接口， 多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可
 */
interface D extends A, B, C {
}

class E implements D {


    @Override
    public void test01() {

    }

    @Override
    public void test02() {

    }

    @Override
    public void test03() {

    }
}