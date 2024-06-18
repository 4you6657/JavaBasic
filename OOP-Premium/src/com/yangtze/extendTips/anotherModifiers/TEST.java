package com.yangtze.extendTips.anotherModifiers;

import com.yangtze.extendTips.modifiers.Entity;

public class TEST {
    public static void main(String[] args) {
        Entity entity = new Entity();
        entity.publicMethod();
        // entity.privateMethod(); // 报错
        // entity.defaultMethod(); // 报错
        // entity.protectedMethod(); // 报错

        Player player = new Player();
        player.test();
        player.publicMethod();
        // player.testModifiers();
    }
}
