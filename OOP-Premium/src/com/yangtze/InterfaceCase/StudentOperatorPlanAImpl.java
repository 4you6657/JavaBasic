package com.yangtze.InterfaceCase;

import java.util.ArrayList;

public class StudentOperatorPlanAImpl implements StudentOperator {
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("姓名：" + student.getName());
            System.out.println("性别：" + student.getSex());
            System.out.println("成绩：" + student.getScore());
        }
        System.out.println("------------------------------");
    }

    @Override
    public void printAvgScore(ArrayList<Student> students) {
        double totalScore = 0.0f;
        for (Student student : students) {
            totalScore += student.getScore();
        }
        System.out.println("平均分：" + totalScore / students.size());
    }
}
