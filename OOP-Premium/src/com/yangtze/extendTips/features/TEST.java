package com.yangtze.extendTips.features;

public class TEST {
    public static void main(String[] args) {
        A parent = new A();
        B children = new B();
        C grandChildren = new C();
    }
}

/* Object类是所有Java类的基类 */
class A {} /* extends Object */

class B extends A{}

class C extends B{}
