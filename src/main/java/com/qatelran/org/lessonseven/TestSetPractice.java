package com.qatelran.org.lessonseven;

import java.util.*;

public class TestSetPractice {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "B", "E", "D", "E", "B");
        Set<String> stringSet = new TreeSet<>();
        for (String str : stringList) {
            stringSet.add(str);
        }
        System.out.println(stringSet);

        //создать список из элементов, которые встречаются два и более раза
        List<String> doubles = new ArrayList<>();
        Set<String> unique = new TreeSet<>();
        for (String str : stringList) {
            if (unique.contains(str)) {
                doubles.add(str);
            } else {
                unique.add(str);
            }
        }
        System.out.println(doubles);
    }
}
