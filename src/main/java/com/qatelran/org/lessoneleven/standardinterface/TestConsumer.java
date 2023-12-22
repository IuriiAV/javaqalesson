package com.qatelran.org.lessoneleven.standardinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {

    public static void main(String[] args) {
        //Consumer -  accept принимает переменную и что-то с ней делает, вызываем метод accept
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Integer = " + integer);
            }
        };
        Consumer<Integer> integerConsumer = integer -> System.out.println("Integer = " + integer);
        integerConsumer.accept(20);

//        Consumer<Integer> womanDiscount = discount ->
//                System.out.println("Woman discount = " + discount);
//
//        womanDiscount.accept(40);

        List<Integer> list = Arrays.asList(1, 4, 5, 6, 7);
        Consumer<List<Integer>> modify = integers -> {
            for (int i = 0; i < integers.size(); i++) {
                list.set(i, list.get(i) * 2);
            }
        };
        Consumer<List<Integer>> modifyTwo = integers ->
                integers.replaceAll(integer -> 2 * integer);

        System.out.println(list);

        modify.accept(list);

        System.out.println(list);
    }
}
