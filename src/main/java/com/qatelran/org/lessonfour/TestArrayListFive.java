package com.qatelran.org.lessonfour;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListFive {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Sum of elements " + calculateSum(list));
    }

    private static int calculateSum(List<Integer> list) {
        int sum = 0;
        for(int element : list) {
            sum+=element;  // sum = sum + element;
        }
        return sum;
    }
}
