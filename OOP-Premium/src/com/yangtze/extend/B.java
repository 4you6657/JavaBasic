package com.yangtze.extend;

// B:子类(派生类) A:父类(基类)
public class B extends A {
    // 子类可以继承(直接用)父亲的非私有成员(变量、方法)
    public void print()
    {
        System.out.println(this.number++);
        this.printNumber();
    }

    public B(){
        System.out.println("B的无参构造被调用了~");
    }

}
