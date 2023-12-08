package com.qatelran.org.lessonnine.queue;

public interface MyDeque {
    //FIFO first input first output

    // -> 4 3 2 1 0->
    // 0 1 2 3 4
    // 5 4 3 2 1 0

    // headIndex, tailIndex = 30;
    // . . . . . . . . . . . . . . . . . . . . (.)

    //ArrayDeque
    boolean isEmpty();

    void addToTail(Integer element);

    Integer removeHead();
}
