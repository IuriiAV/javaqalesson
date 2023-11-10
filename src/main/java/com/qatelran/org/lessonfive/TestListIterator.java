package com.qatelran.org.lessonfive;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");

        for(int i = stringList.size() - 1; i >=0; i--) {
            System.out.println("Element = " + stringList.get(i));
        }

        ListIterator<String> iterator = stringList.listIterator();
        // -> A    B   C   D   E
        System.out.println("Elements in forward direction : ");
        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }
        // A    B   C   D   E ->
        System.out.println();

        // A    B   C   D   E <-
        System.out.println("Elements in backwards direction : ");
        while (iterator.hasPrevious()) {
            System.out.print(" " + iterator.previous());
        }
        System.out.println();
    }
}
