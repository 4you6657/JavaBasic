package com.yangtze.references.MethodReferences;

public class CompareByData {

    // 静态方法引用
    public static int compareByAge(Student o1, Student o2) {
        return o1.getAge() - o2.getAge(); // 年龄升序排列
    }

    // 实例方法引用
    // 按照年龄降序排列
    public int compareByAgeDesc(Student o1, Student o2) {
        return o2.getAge() - o1.getAge(); // 年龄降序排列
    }
}
