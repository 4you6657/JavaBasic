package com.yangtze.entity;

// 实体类对应的是软件开发里现在比较流行的方式，让数据和数据的业务处理相分离
public class StudentOperator {
    private final Student student;

    public StudentOperator(Student student) {
        this.student = student;
    }

    public void printIfPass() {
        if (student.getScore() >= 60) {
            System.out.println(student.getName() + "成绩合格！");
        } else {
            System.out.println(student.getName() + "成绩不合格！");
        }
    }
}
