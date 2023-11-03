package com.qatelran.org.lessonfour;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListAppThree {

    public static void main(String[] args) {
        List<String> listOne = new ArrayList<>();
        List<String> listTwo = new ArrayList<>();

        listOne.add("Red");
        listOne.add("Green");
        listOne.add("White");
        listOne.add("Black");
        System.out.println("List one = " + listOne);

        listTwo.add("Red");
        listTwo.add("Pink");
        listTwo.add("Black");
        System.out.println("List two = " + listTwo);

        List<String> list = collectLists(listOne, listTwo);
        System.out.println("Union list = " + list);

        List<String> listUnionTwo = collectListsOptionTwo(listOne, listTwo);
        System.out.println("Union list by addAll = " + listUnionTwo);

        listOne.addAll(listTwo);
        System.out.println("List one = " + listOne);
    }

    private static List<String> collectLists(List<String> one, List<String> two) {
        List<String> newList = new ArrayList<>();
        for (String element : one) {
            newList.add(element);
        }
        for (String element : two) {
            newList.add(element);
        }
        return newList;
    }

    private static List<String> collectListsOptionTwo(List<String> one, List<String> two) {
        List<String> newList = new ArrayList<>();
        newList.addAll(one);
        newList.addAll(two);
        return newList;
    }
}
