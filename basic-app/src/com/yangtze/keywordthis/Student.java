package com.yangtze.keywordthis;

public class Student {
    double score;

    public void printThis() {
        System.out.println(this);
    }

    public void printThisActualImplement(Student this) {
        System.out.println(this);
    }

    public void printPass(double score) {
        if (this.score > score) {
            System.out.println("Congratulations! You have pass the exam!");
        } else {
            System.out.println("You failed!");
        }
    }
}
