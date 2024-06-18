package com.yangtze.AbstractCase;

public class Cat extends Animals {

    public Cat() {

    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println(this.getName() + "Meow~");
    }
}
