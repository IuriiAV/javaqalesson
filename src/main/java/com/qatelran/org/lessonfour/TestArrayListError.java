package com.qatelran.org.lessonfour;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListError {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("One");
        System.out.println(stringList);
        System.out.println("Size = " + stringList.size());
        clearList(stringList);
        System.out.println("Size = " + stringList.size());
    }

    private static void clearList(List<String> list) {
        list.clear();
    }
}
