package com.qatelran.org.lessonfive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterateCollection {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(7);

        //Arrays.asList(e,e,e,e,e) - add elements to list
        //List<Integer> integerList1 = Arrays.asList(3, 4, 2, 1, 5, 7, 8, 9);

        //List.of(e,e,e,e) - add elements from 1 to 10 to list
        //List<Integer> integerList = List.of(3, 4, 2, 1, 5, 7, 8, 9);

        //#1
        System.out.println("For with counter :");
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            System.out.print(" " + integer);
        }
        System.out.println();

        //#2
        System.out.println("For each :");
        for (Integer integer : list) {
            System.out.print(" " + integer);
        }
        System.out.println();

        //#3
        System.out.println("Iterator : ");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.print(" " + integer);
        }
        System.out.println();

        //#4
        System.out.println("For each with lambda");
        list.forEach(integer -> {
            System.out.print(" " + integer);
        });
    }
}
