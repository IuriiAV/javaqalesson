package com.qatelran.org.lessonfive;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestRemoveByIterator {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");

        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            if ("C".equals(element)) {
                stringList.remove(i);
            }
        }

        System.out.println(stringList);

        for (String element : stringList) {
            if ("D".equals(element)) {
                stringList.remove(element);
            }
        }

        System.out.println(stringList);

        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if ("B".equals(element)) {
                iterator.remove();
            }
        }

        System.out.println(stringList);
    }
}
