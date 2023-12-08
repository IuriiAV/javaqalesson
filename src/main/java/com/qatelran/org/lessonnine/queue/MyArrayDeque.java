package com.qatelran.org.lessonnine.queue;

public class MyArrayDeque implements MyDeque {

    private Integer[] elements;

    private int numberOfElements;

    private int headIndex;
    private int tailIndex;

    public MyArrayDeque(int capacity) {
        elements = new Integer[capacity];
        headIndex = capacity - 1;
        tailIndex = capacity - 1;
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    // headIndex, tailIndex = 30;
    // . . . . . . . . . . . . . . . . . . (.) 5 10
    // numberOfElements = 2;

    //() 1 . . . . . . . . . . . . . . . . . . 5 10  // tailIndex = -1; numberOfElements = 30;
    @Override
    public void addToTail(Integer element) {
        if (numberOfElements == elements.length) {
            System.out.println("The queue is full");
            return;
        }
        elements[tailIndex] = element;
        tailIndex--;
        numberOfElements++;
    }

    // || headIndex = 30
    // () tailIndex = 28;
    // . . . . . . . . . . . . . . . . . . (.) 5 |10|
    // numberOfElements = 2;

    // || headIndex = 29
    // () tailIndex = 28;
    // . . . . . . . . . . . . . . . . . . (.)|5| 10
    // numberOfElements = 1;

    // || headIndex = 28
    // () tailIndex = 28;
    // . . . . . . . . . . . . . . . . . . |(.)| 5 10
    // numberOfElements = 0;
    @Override
    public Integer removeHead() {
        if (headIndex < 0) {
            System.out.println("The  queue is empty ");
            return null;
        }
        Integer current = elements[headIndex];
        headIndex--;
        numberOfElements--;
        return current;
    }

    //We don't know about StringBuilder now
    @Override
    public String toString() {
        String result = "";
        for (int i = tailIndex + 1; i <= headIndex; i++) {
            result = result + " " + elements[i];
        }
        return result;
    }
}
