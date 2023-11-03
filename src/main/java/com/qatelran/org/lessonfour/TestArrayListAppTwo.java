package com.qatelran.org.lessonfour;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListAppTwo {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        if(integerList.size() > 0) {
            Integer integer = integerList.get(0);
        }
        //isEmpty() - check size of list
        if(!integerList.isEmpty()) {
            Integer integer = integerList.get(0);
        }

        integerList.add(3);
        integerList.add(5);
        integerList.add(2);

        int integer = integerList.get(1);

        //        while (!integerList.isEmpty()) {
        //
        //        }
        System.out.println("Size before clear " + integerList.size());
        integerList.clear();
        System.out.println("Size after clear " + integerList.size());

        integerList.add(3);
        integerList.add(5);
        integerList.add(2);
        // contains - check that element exists
        boolean contains = integerList.contains(5);
        System.out.println("Contains 5 is " + contains);

    }
}
