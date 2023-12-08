package com.qatelran.org.lessonnine.queue;

public class MyArrayDeque implements MyDeque {

    private Integer[] elements;

    public MyArrayDeque(int capacity) {
        elements = new Integer[capacity];
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void addToTail(Integer element) {

    }

    @Override
    public Integer removeHead() {
        return null;
    }
}
