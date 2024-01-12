package com.qatelran.org.lessontwelve.searchengine;

import java.util.function.Predicate;

public class PredicateCompoundExample {

    public static void main(String[] args) {

        Predicate<String> stringPredicate1 = s -> s.startsWith("S");
        Predicate<String> stringPredicate2 = s -> s.contains("k");
        // Найти строку начинающуюся с S и содержащую k

        boolean result1 = stringPredicate1.and(stringPredicate2).test("Hello");
        System.out.println(result1);

        boolean result2 = stringPredicate1.and(stringPredicate2).test("Skate");
        System.out.println(result2);

    }
}
