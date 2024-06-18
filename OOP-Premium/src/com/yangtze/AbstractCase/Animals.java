package com.yangtze.AbstractCase;

public abstract class Animals {
    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public Animals() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void cry();
}
