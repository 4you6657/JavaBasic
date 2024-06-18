package com.yangtze.finalKeyword;

public class Validation {
    /**
     * final 修饰变量的注意事项：
     * final 修饰基本类型的变量，变量存储的数据不能被改变
     * final 修饰引用类型的变量，变量存储的地址不能被改变，但地址所指向对象的内容是可以被改变的
     */
    public static void main(String[] args) {
        final int[] arr = {11, 22, 33};
        // arr = null; 报错！
        System.out.println(arr[1]);
        System.out.println(SCHOOL_NAME);
    }
    /**
     * 常量：使用 static final 修饰的成员变量就被称为常量
     * 作用：通常用于记录系统的配置信息
     * 注意：常量名的命名规范，建议使用大写英文单词，多个单词使用下划线连接起来
     * 使用常量记录系统配置信息的优势、执行原理
     * + 代码可读性、可维护性更好
     * + 程序编译后，常量会被“宏替换”，即出现常量的地方全部会被替换成其记住的字面量，这样可以保证使用常量和直接用字面量的性能开销是一样的。
     */
    public static final String SCHOOL_NAME = "itcast";
}
