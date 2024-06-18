package com.yangtze.extendOverride;

public class TEST {
    public static void main(String[] args) {
        // 目标：认识方法重写，掌握方法重写的常见应用场景
        B instance = new B();
        // instance.print();
        // 一旦完成了子类对父类的方法重写，子类的实例化对象在调用方法时会遵循“就近原则”，即调用子类重写的方法
        instance.print();

        // 重写技巧
        /**
         * 1、使用@Override注解：可以指定Java编译器，检查我们方法重写的格式是否正确，代码可读性也会更好
         * 2、子类重写父类方法时，访问权限必须大于或者等于父类该方法的权限（public > protected > 缺省）
         * 3、重写的方法返回值类型，必须与被重写方法的返回值类型一致，或者范围更小
         * 4、私有方法、静态方法不能够被重写，如果重写会报错
         */

        Student s = new Student("MIKE", 20);
        System.out.println(s.toString());
        System.out.println(s);

        // 方法重写
        // 子类写了一个方法名称，形参列表与父类某个方法一样的方法去覆盖父类的该方法
        // 注意事项
        /**
         * 建议使用@Override注解，可以校验重写是否正确，代码可读性也会更好
         * 子类重写父类方法时，访问权限必须大于或者等于父类该方法的权限（public > protected > 缺省）
         * 重写的方法返回值类型，必须与被重写方法的返回值类型一致，或者范围更小
         * 私有方法、静态方法不能够被重写，如果重写会报错
         */

    }
}
