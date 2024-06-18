package com.yangtze.EnumClass;

public class TEST {
    public static void main(String[] args) {
        EnumClass ENUM_A_INSTANCE = EnumClass.X;
        System.out.println(ENUM_A_INSTANCE);
        ENUM_A_INSTANCE.setName("ENUM_A");
        System.out.println(ENUM_A_INSTANCE.getName());


        AbstractEnumClass x = AbstractEnumClass.X;
        x.go();

        AbstractEnumClass.X.go();
    }
}