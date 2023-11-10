package com.qatelran.org.lessonfive;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterators {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(" Element = " + stringList.get(i));
        }

        System.out.println();

        // can iterate through collection
        Iterator<String> iterator = stringList.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element by iterator = " + element);
        }
        // -> A  B  C  D  E ->
        System.out.println();

        Iterator<String> iteratorTwo = stringList.iterator();
        System.out.println("Element without while " + iteratorTwo.next());
        System.out.println("Element without while " + iteratorTwo.next());
        System.out.println("Element without while " + iteratorTwo.next());
        System.out.println("Element without while " + iteratorTwo.next());
        System.out.println("Element without while " + iteratorTwo.next());
        //System.out.println("Element without while " + iteratorTwo.next());

    }
}
