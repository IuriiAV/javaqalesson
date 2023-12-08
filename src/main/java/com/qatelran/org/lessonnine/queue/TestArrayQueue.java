package com.qatelran.org.lessonnine.queue;

public class TestArrayQueue {

    public static void main(String[] args) {
        MyDeque myDeque = new MyArrayDeque(10);

        //3
        myDeque.addToTail(10);
        myDeque.addToTail(5);
        System.out.println("The queue is = " + myDeque);
        System.out.println("Element from head = " + myDeque.removeHead());
        myDeque.addToTail(4);
        myDeque.addToTail(3);
        System.out.println("The queue is = " + myDeque);
        System.out.println("Element from head = " + myDeque.removeHead());
        System.out.println("Element from head = " + myDeque.removeHead());
        System.out.println("The queue is = " + myDeque);
        // 9 7 1 4 3
        myDeque.addToTail(4);
        myDeque.addToTail(1);
        myDeque.addToTail(7);
        myDeque.addToTail(9);

        while (!myDeque.isEmpty()) {
            System.out.println(myDeque.removeHead());
        }
    }
}
