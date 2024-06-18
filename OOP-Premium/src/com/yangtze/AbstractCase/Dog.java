package com.yangtze.AbstractCase;

public class Dog extends Animals {

    public Dog() {

    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println(this.getName() + "Wolf~");
    }
}
