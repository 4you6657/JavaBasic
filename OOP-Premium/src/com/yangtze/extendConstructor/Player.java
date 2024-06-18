package com.yangtze.extendConstructor;

public class Player extends Entity {

    private String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Player() {
        System.out.println("子类的无参数构造器执行了~");
    }

    public Player(String name, double position) {
        // this(...) 调用兄弟构造器
        // 任意类的构造中，是可以通过this(...)去调用该类的其它构造器的
        // this, super都只能放在构造器的第一行，因此，有了this就不能写super了，反之亦然。
        this("AMY", 1.23456,"DEFEND");
    }
    public Player(String name, double position, String skill) {
        super(name, position); // 调用父类中的有参数构造器
        this.skill = skill;
        System.out.println("子类的有参数构造器执行了~");
    }
}
