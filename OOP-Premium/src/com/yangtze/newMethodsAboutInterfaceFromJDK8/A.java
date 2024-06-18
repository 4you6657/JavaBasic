package com.yangtze.newMethodsAboutInterfaceFromJDK8;

public interface A {
    /**
     * 1、默认方法：必须使用default修饰，默认会被public修饰
     * 实例方法（对象方法），必须使用接口实现类的对象来访问。
     */
    public default void test01() {
        System.out.println("======默认方法======");

        // test02();
    }

    /**
     * 2、私有方法：必须使用private修饰，(JDK 9 开始才支持)
     * 实例方法（对象方法）
     */

//    private void test02() {
//        System.out.println("======私有方法======");
//    }

    /**
     * 3、静态方法：必须使用static修饰，默认会被public修饰
     */

    static void test03() {
        System.out.println("======静态方法======");
    }
}
