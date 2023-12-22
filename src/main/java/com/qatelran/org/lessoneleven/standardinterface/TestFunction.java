package com.qatelran.org.lessoneleven.standardinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args) {
        //Function - apply метод принимает значение одного типа и возвращает значение другого типа
        Function<Integer,Double> divide = integer -> integer / 3.5;
        System.out.println(divide.apply(7));
        System.out.println(divide.apply(5));

        //В виде анонимного класса
        Function<String[],  List<String>> convertAsAC = new Function<String[], List<String>>() {
            @Override
            public List<String> apply(String[] strings) {
                return Arrays.asList(strings);
            }
        };
        //В виде лямбда выражения
        Function<String[],  List<String>> convert = strings -> Arrays.asList(strings);

        String[] strings = {"Hello", "World"};
        List<String> newList = convert.apply(strings);
        System.out.println(newList);
    }

    private List<String> convertArray(String[] strings) {
        return Arrays.asList(strings);
    }

    private static double divide(int value) {
        double result = value / 3.5;
        return result;
    }
}
