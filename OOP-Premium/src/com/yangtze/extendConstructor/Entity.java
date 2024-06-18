package com.yangtze.extendConstructor;

public class Entity {
    public Entity(){
        System.out.println("父类的无参数构造器执行了~");
    }

    private String name;
    private double position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }

    public Entity(String name, double position){
        System.out.println("父类的有参数构造器执行了~");
        this.name = name;
        this.position = position;
    }
}
