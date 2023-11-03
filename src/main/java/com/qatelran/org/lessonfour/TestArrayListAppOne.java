package com.qatelran.org.lessonfour;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayListAppOne {

    public static void main(String[] args) {
        String[] strings = new String[5];
        //List
        ArrayList<String> stringList = new ArrayList<>();
        List<String> list = new ArrayList<>();
        //List - 0 indexed
        //add - add element to list to end of the list
        stringList.add("Hello");
        list.add("Hello");
        list.add("World");
        list.add("Again");
        System.out.println(list);
        //add(index, element) - add element to list by index
        list.add(0, "Hi!");
        System.out.println(list);
        list.add(2, "Unique");
        System.out.println(list);
        //get(index) - get element by index
        String s = list.get(1);
        System.out.println("Element s = " + s);
        //set(index, element) - replace old element by new in index
        list.set(1, "Welcome!");
        System.out.println(list);
        //remove - delete element by index
        list.remove(1);
        System.out.println(list);

        System.out.println();

        //size() - get size of list
        for (int i = 0; i < list.size(); i++) {
            //String element = list.get(i);
            System.out.println("Element by index " + i + " = " + list.get(i));
        }

        System.out.println("Iterate by foreach :");
        for (String element : list) {
            System.out.println("Element =  " + element);
        }
    }
}
