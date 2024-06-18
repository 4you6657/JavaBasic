package com.yangtze.InterfaceCase;

import java.util.ArrayList;

public class StudentOperatorPlanBImpl implements StudentOperator {
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        int numOfBoys = 0;
        int numOfGirls = 0;
        for (Student student : students) {
            System.out.println("姓名：" + student.getName());
            System.out.println("性别：" + student.getSex());
            System.out.println("成绩：" + student.getScore());
            if (student.getSex() == '0') {
                numOfGirls++;
            } else {
                numOfBoys++;
            }
        }
        System.out.println("班级人数：" + students.size());
        System.out.println("男生人数：" + numOfBoys);
        System.out.println("女生人数：" + numOfGirls);
    }

    @Override
    public void printAvgScore(ArrayList<Student> students) {
        double totalScore = 0.0f;
        double maxScore = students.get(0).getScore();
        double minScore = students.get(0).getScore();
        for (Student student : students) {
            if (student.getScore() > maxScore) {
                maxScore = student.getScore();
            } else if (student.getScore() < minScore) {
                minScore = student.getScore();
            }
            totalScore += student.getScore();
        }
        System.out.println("最高分：" + maxScore);
        System.out.println("最低分：" + minScore);
        System.out.println("平均分：" + (totalScore - maxScore - minScore) / (students.size() - 2));
    }
}
