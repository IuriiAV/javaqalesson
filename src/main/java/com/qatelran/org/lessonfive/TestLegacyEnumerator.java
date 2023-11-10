package com.qatelran.org.lessonfive;

import java.util.Enumeration;
import java.util.Vector;

public class TestLegacyEnumerator {

    public static void main(String[] args) {
        // List  - Vector, Stack
        // Map - Dictionary, HashTable, Properties
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < 10; i ++) {
            vector.add(i);
        }
        System.out.println(vector);

        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            Integer integer = enumeration.nextElement();
            System.out.print(" " + integer);
        }
    }
}
