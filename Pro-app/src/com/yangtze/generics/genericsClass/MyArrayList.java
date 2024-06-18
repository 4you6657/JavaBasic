package com.yangtze.generics.genericsClass;

public class MyArrayList<E> {
    private Object[] arr = new Object[10];
    private int pos;

    public boolean add(E entity) {
        arr[pos++] = entity;
        return true;
    }

    public E get(int index) {
        return (E) arr[index];
    }
}
