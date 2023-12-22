package com.qatelran.org.lessoneleven;

//Для того что бы использовать сокращенную форму записи,
//в интерфейсе должен быть только один метод, который должен быть реализован
//Причем дефолтные и статические методы никак не влияют на сокращенную форму,
//таких методов может быть несколько
//Данный интерфейс - функциональный интерфейс
//А значит его можно записать в виде лямбда выражения

@FunctionalInterface
public interface IntegerOperation {

    void multiply(int a); // единственный абстрактный метод

    // void divide(int b);

    default void printGreetings() {
        System.out.println("Hello");
    }

    static void printHello() {
        System.out.println("Hello");
    }
}
