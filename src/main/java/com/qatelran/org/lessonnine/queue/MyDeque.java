package com.qatelran.org.lessonnine.queue;

public interface MyDeque {
    //FIFO first input first output
    // -> 4 3 2 1 0->
    //ArrayDeque
    boolean isEmpty();

    void addToTail(Integer element);

    Integer removeHead();
}
