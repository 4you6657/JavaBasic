package com.yangtze.EnumClass;

public enum EnumClass {
    // 注意：枚举类的第一行必须罗列的是枚举对象的名字
    /*
        + 枚举类的第一行只能罗列一些名称，这些名称都是常量，并且每个常量记住的都是枚举类的一个对象
        + 枚举类的构造器都是私有的（写不写都只能是私有的），因此，枚举类对外不能创建对象
        + 枚举类都是最终类，不可以被继承
        + 枚举类中，从第二行开始，可以定义类的其它成员
        + 编译器为枚举类新增了几个方法，并且枚举类都是继承：java.lang.Enum类的，从enum类也会继承到一些方法
     */
    X, Y, Z;

    private EnumClass() {
    }

    private EnumClass(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
