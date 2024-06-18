package com.yangtze.EnumClass;

// 抽象枚举类
public enum AbstractEnumClass {
    X("MIKE") {
        @Override
        public void go() {
            System.out.println(this.getName() + "is Running~");
        }
    },
    Y() {
        @Override
        public void go() {

        }
    },
    Z() {
        @Override
        public void go() {

        }
    };

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    AbstractEnumClass() {
    }

    AbstractEnumClass(String name) {
        this.name = name;
    }

    public abstract void go();
}
