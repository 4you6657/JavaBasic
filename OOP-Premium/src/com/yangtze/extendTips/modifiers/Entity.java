package com.yangtze.extendTips.modifiers;

public class Entity {
    // 1、private：只能在本类中访问
    private void privateMethod() {
        System.out.println("私有方法被调用了~");
    }

    // 2、缺省：本类、同一个包下的类可以访问
    void defaultMethod() {
        System.out.println("缺省方法被调用了~");
    }

    // 3、protected：本类、同一个包下的类、任意包下的子类可以访问
    protected void protectedMethod() {
        System.out.println("保护方法被调用了~");
    }

    // 4、public：本类、同一个包下的类、任意包下的任意类可以访问
    public void publicMethod() {
        System.out.println("公有方法被调用了~");
    }


    public void testModifiers(){
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
}
