package com.qatelran.org.lessontwo;

import java.util.Arrays;

public class PolyExampleTwo {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String[] strings = {"One", "Two", "Three"};

        Arrays.sort(arr);
        Arrays.sort(strings);

        /*
        Arrays.sortInt(arr);
        Arrays.sortString(strings);
         */

        printArray(arr);
        //printStringArray(strings); // - wrong way
        printArray(strings);
    }

    public static void printArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
