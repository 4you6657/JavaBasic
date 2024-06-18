package com.yangtze.Exceptions;

public class MyExceptionDemo {
    public static void main(String[] args) {
        /*
            掌握自定义异常,以及异常的作用
                + Java无法为世界上全部的问题都提供异常类来代表，如果企业自己的某种问题，想通过异常来表示
                    以便用异常来管理该问题，那就需要自己来定义异常类了。
         */
/*        try {
            // 自定义运行时异常RuntimeException
            saveAgeRuntimeException(230);
            System.out.println("Saved Successfully!");
        } catch (Exception e) {
            System.out.println("Error occurred! Reasons below: ");
            e.printStackTrace();
            throw new RuntimeException(e);
        }*/

        try {
            // 自定义编译时异常Exception
            saveAgeException(222);
        } catch (AgeIllegalException e) {
            e.printStackTrace();

            throw new RuntimeException(e);
        }
    }

    public static void saveAgeRuntimeException(int age) {
        if (age > 0 && age < 150) {
            System.out.println("年龄被成功保存~");
        } else {
            // 用一个异常对象封装这个问题
            /*
                自定义运行时异常RuntimeException
                + 定义一个异常类继承RuntimeException
                + 重写构造器
                + 通过 throw new 异常类(xxx) 来创建异常对象并抛出
                (编译阶段不报错，提醒不强烈，运行时才可能出现！)
             */
            // throws 抛出去这个异常对象
            throw new AgeIllegalRuntimeException("年龄非法！");
        }
    }


    // 自定义编译时异常
    public static void saveAgeException(int age) throws AgeIllegalException {
        if (age > 0 && age < 150) {
            System.out.println("年龄被成功保存~");
        } else {
            // 用一个异常对象封装这个问题
            /*
                自定义运行时异常RuntimeException
                + 定义一个异常类继承RuntimeException
                + 重写构造器
                + 通过 throw new 异常类(xxx) 来创建异常对象并抛出
                (编译阶段不报错，提醒不强烈，运行时才可能出现！)
             */
            // throw 用在try...catch{}块中，抛出异常对象
            // throws 用在方法上，抛出方法内部的异常

            /*
                3、通过 throw new 异常类(xxx)来创建自定义异常对象并抛出。
                    编译阶段就报错，提醒更加强烈！
             */
            throw new AgeIllegalException("年龄非法！");
        }
    }
}
