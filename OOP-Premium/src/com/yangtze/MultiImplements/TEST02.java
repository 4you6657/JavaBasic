package com.yangtze.MultiImplements;

public class TEST02 {
    public static void main(String[] args) {
        /**
         *  接口其它注意事项
         * 1、一个接口继承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承
         * 2、一个类实现了多个接口，如果多个接口中存在方法签名冲突，则此时不支持多实现
         * 3、一个类继承了父类，又同时实现了接口，父类中和接口中有同名的默认方法，实现类会优先用父类的
         * 4、一个类实现了多个接口， 多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可
         */

        Player player = new Player();
        player.test01();
    }
}

interface I {
    default void test01() {
        System.out.println("接口I中的test01()方法执行了~");
    }
}

interface J {
    // String test01();
    default void test01(){
        System.out.println("接口J中的test01()方法执行了~");
    }
}

class Entity{
    public void test01(){
        System.out.println("父类的test01()方法执行了~");
    }

}

/*interface K extends I, J {
}*/

// 2、一个类实现了多个接口，如果多个接口中存在方法签名冲突，则此时不支持多实现
/*class E implements I, J{
}*/

class Player extends Entity implements I{
}

class Animals implements I, J{

    @Override
    public void test01() {
        System.out.println("Animals的test01()方法执行了~");
    }
}
