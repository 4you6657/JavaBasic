package com.yangtze.ObjectClass;

import java.util.Arrays;
import java.util.Objects;

// Cloneable是一个标记接口，是一种规则。
public class User extends Object implements Cloneable {
    private int id;
    private String username;
    private String password;
    private double[] scores;

    public User() {
    }

    public User(int id, String username, String password, double[] scores) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.scores = scores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return getId() == user.getId() && Objects.equals(getUsername(), user.getUsername()) && Objects.equals(getPassword(), user.getPassword()) && Arrays.equals(getScores(), user.getScores());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getId(), getUsername(), getPassword());
        result = 31 * result + Arrays.hashCode(getScores());
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // super去调用父类Object中的clone方法

        // return super.clone();
        User u2 = (User) super.clone();
        u2.scores = u2.scores.clone();
        return u2;
    }
}
