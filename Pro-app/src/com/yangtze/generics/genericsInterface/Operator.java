package com.yangtze.generics.genericsInterface;

import com.yangtze.generics.genericsClass.Animal;

import java.util.ArrayList;

// 泛型接口
// public interface Operator<T extends Animal> {
public interface Operator<T> {
    void add(T t);

    ArrayList<T> getByName(String name);
}
