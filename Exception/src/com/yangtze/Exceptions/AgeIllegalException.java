package com.yangtze.Exceptions;

// 1、必须要让这个类继承自Exception，才能成为一个编译时异常类
public class AgeIllegalException extends Exception {
    // 2、重写构造器

    public AgeIllegalException() {
    }

    public AgeIllegalException(String message) {
        super(message);
    }
}
