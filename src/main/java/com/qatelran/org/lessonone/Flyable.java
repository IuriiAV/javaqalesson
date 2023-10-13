package com.qatelran.org.lessonone;

public interface Flyable {

    default void printHello() {
        System.out.println("Hello");
    }

    void fly();

}
