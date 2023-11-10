package com.qatelran.org.lessonfive;

import java.util.ArrayList;
import java.util.List;

public class TestHW {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
            System.out.println();
        }
        endTime = System.currentTimeMillis();
        System.out.println(" Add 10M elements to list takes " + (endTime - startTime));
    }

}
