package com.yangtze.extendTips.anotherModifiers;

import com.yangtze.extendTips.modifiers.Entity;

public class Player extends Entity {
    public void test(){
        protectedMethod();
        // privateMethod(); // 报错
        publicMethod();
        // defaultMethod(); // 报错
    }

}
