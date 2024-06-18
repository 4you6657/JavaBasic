package com.yangtze.references.MethodReferences;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        /*
            - 静态方法的引用
                + 类名::静态方法
            - 使用场景
                + 如果某个Lambda表达式里只是调用一个静态方法，并且前后参数的形式一致，就可以使用静态方法引用。
         */

        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精", 169.5, 23);
        students[1] = new Student("紫霞", 163.8, 26);
        students[2] = new Student("紫霞", 163.8, 26);
        students[3] = new Student("至尊宝", 167.5, 24);


        // 方法引用对上述Lambda表达式进一步简化

        // 原始写法：对数组中的学生对象，按照年龄升序排序
        /*Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge(); // 按照年龄升序排序
            }
        });*/
        // 使用Lambda简化后的形式
        // Arrays.sort(students, ((o1, o2) -> o1.getAge() - o2.getAge()));
        // 进一步简化
        // Arrays.sort(students, ((o1, o2) -> CompareByData.compareByAge(o1, o2)));
        // 最终简化版本
        // Arrays.sort(students, CompareByData::compareByAge); // 静态方法引用：进一步简化上述代码


        /*
            - 实例方法的引用
                + 对象名::实例方法
            - 使用场景
                + 如果某个Lambda表达式里只是调用一个实例方法，并且前后参数的形式一致，就可以使用实例方法引用

         */

        // Arrays.sort(students, (o1, o2) -> o2.getAge() - o1.getAge()); // 降序排列
        Arrays.sort(students, (o1, o2) -> new CompareByData().compareByAgeDesc(o1, o2)); // 降序（进一步简化）
        Arrays.sort(students, new CompareByData()::compareByAgeDesc); // 降序（最终简化版本）




        System.out.println(Arrays.toString(students));
    }
}
