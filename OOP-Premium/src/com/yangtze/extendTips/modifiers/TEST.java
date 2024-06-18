package com.yangtze.extendTips.modifiers;

public class TEST {
    public static void main(String[] args) {
        Entity entity = new Entity();
        // entity.privateMethod(); // 报错
        entity.defaultMethod();
        entity.protectedMethod();
        entity.publicMethod();
    }
}
