package com.qatelran.org.lessoneleven.standardinterface;

import java.util.function.Predicate;

public class TestPredicate {

    public static void main(String[] args) {
        //Predicate - метод test принимает переменную и возвращает либо тру либо фолз
        //Predicate
        System.out.println(" 5 divide by 2 without rest " + checkDivideByTwo(5));

        Predicate<Integer> checkDivide = value -> {
            if (value % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };

        Predicate<Integer> checkDivideBy2 = value -> value % 2 == 0;

        boolean test = checkDivideBy2.test(6);
        System.out.println("6 divide by 2 without rest " + test);
    }

    private static boolean checkDivideByTwo(int value) {
        boolean result = value % 2 == 0;
        return result;
    }
}
