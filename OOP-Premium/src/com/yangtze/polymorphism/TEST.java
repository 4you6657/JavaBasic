package com.yangtze.polymorphism;

public class TEST {
    public static void main(String[] args) {

        /**
         * 多态是在继承/实现情况下的一种现象
         * 前提：
         * 1、有继承/实现关系；
         * 2、存在父类引用子类对象；
         * 3、存在方法重写
         *
         * 多态是对象、行为的多态，Java中的属性（成员变量）不谈多态。
         */

        // 优势1：在多态形式下，右边对象是解耦合的，更便于扩展和维护
        People p1 = new Teacher();
        People p2 = new Student();

        p1.run(); // 行为多态的识别技巧：编译看左边，识别看右边。
        p2.run();

        // 对于属性（成员变量），编译看左边，运行也看左边。
        System.out.println(p1.name);
        System.out.println(p2.name);

        Student s = new Student();
        Teacher t = new Teacher();

        go(s);
        go(t);

        // 多态下存在的问题：无法直接调用子类的独有功能
        // p1.test();  // 报错！

        // 使用强制类型转换
        if (p1 instanceof Student) {
            Student s1 = (Student) p1;
            s1.test();
        } else {
            Teacher t1 = (Teacher) p1;
            t1.teach();
        }


        // 类型转换
        // 1、自动类型转换：父类 变量名 = new 子类(); People p = new Teacher();
        // 2、强制类型转换：子类 变量名 = (子类)父类变量; Teacher t = (Teacher)p;
        // 强制类型转换的注意事项
        // 1、存在继承/实现关系就可以在编译阶段进行强制类型转换，编译阶段不会报错
        // 2、运行时，如果发现对象的真实类型与强转后的类型不同，就会报类型转换异常（ClassCastException）的错误出来

        // 强制转换前，Java建议：使用instanceof关键字，判断当前对象的真实类型，再进行强转。


    }

    // 优势2：可以使用父类类型的变量作为形参，可以接收一切子类对象
    public static void go(People p) {

    }
}
