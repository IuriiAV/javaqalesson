package com.qatelran.org.lessontwelve;

import java.util.function.Function;

public class TestComposeAndThen {

    public static void main(String[] args) {
        Function<String,String> function1 = s -> s + "1";
        Function<String,String> function2 = s -> s + "2";
        Function<String,String> function3 = s -> s + "3";
        Function<String,String> function4 = s -> s + "4";

        String result = function1.andThen(function2).andThen(function3).andThen(function4)
                .apply(" And Then ");
        System.out.println(result);

        String result1 = function1.apply(" And Then ");
        String result2 = function2.apply(result1);
        String result3 = function3.apply(result2);
        String result4 = function4.apply(result3);
        System.out.println(result4);

        String compose = function1.andThen(function2).compose(function3).compose(function4)
                .apply(" Compose ");
        System.out.println(compose);

        String composeResult1 = function4.apply(" Compose ");
        String composeResult2 = function3.apply(composeResult1);
        String composeResult3 = function1.apply(composeResult2);
        String composeResult4 = function2.apply(composeResult3);
        System.out.println(composeResult4);

        Function<String, String > function = Function.identity();
        System.out.println(function.apply("Some value"));

    }
}
