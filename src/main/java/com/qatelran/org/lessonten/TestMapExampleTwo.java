package com.qatelran.org.lessonten;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMapExampleTwo {

    public static void main(String[] args) {

        int[] array = {1, 7, 4, 3, 4, 8, 7};
        int k = 2;

        // Time complexity O(n^2)
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            int temp = array[i];
            for (int j = 0; j < array.length; j++) {
                if (temp == array[j]) {
                    count++;
                }
            }
            if (count == k) {
                System.out.println("Found element with count == k " + temp);
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer element : array) {
            if (map.containsKey(element)) {
                Integer value = map.get(element);
                map.put(element, value + 1);
            } else {
                map.put(element, 1);
            }
        }
        //Example for List
        List<String> str = new ArrayList<>();
        str.forEach(v -> {
            System.out.println("Value = " + v);
        });
        //Example for Map
        map.forEach((key, value) -> {
            System.out.println("Key " + key + " contains " + value + " times");
        });

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            Integer value = map.get(temp);
            if (value == k) {
                System.out.println("Found first element with count k times  = " + temp);
                break;
            }
        }
    }
}
