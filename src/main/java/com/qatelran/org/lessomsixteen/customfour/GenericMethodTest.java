package com.qatelran.org.lessomsixteen.customfour;

import java.util.function.Function;

public class GenericMethodTest {

    public static void main(String[] args) {

        printClassName("Hello");
        printClassName(5);
        printClassName(4.4);

        printClassNameTwo("Hello again");
        printClassNameTwo(6);
        printClassNameTwo(5.5);

    }

    private static void printClassName(Object element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    private static <T> void printClassNameTwo(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    private static <T, U> U printClassNameThree(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
        U elementTwo = null;
        return elementTwo;
    }

    private static void printClassName(String element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    private static void printClassName(Integer element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }
}
