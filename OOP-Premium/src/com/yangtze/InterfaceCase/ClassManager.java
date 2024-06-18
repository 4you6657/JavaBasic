package com.yangtze.InterfaceCase;

import java.util.ArrayList;

public class ClassManager {
    private final ArrayList<Student> students = new ArrayList<>();

    private final StudentOperator operator = new StudentOperatorPlanAImpl();

    public ClassManager() {
        students.add(new Student("MIKE", '1', 95));
        students.add(new Student("AMY", '0', 90));
        students.add(new Student("YORK", '1', 80));
        students.add(new Student("CINDY", '0', 60));
    }

    // 打印全班全部学生的信息
    public void printInfo() {
        operator.printAllInfo(students);
    }

    // 打印全班全部学生的平均分
    public void printAvgScore() {
        operator.printAvgScore(students);
    }
}
