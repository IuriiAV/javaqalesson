package com.qatelran.org.lessontwelve;

import java.util.function.Function;

public class TestFI {

    public static void main(String[] args) {
        MyFunction myFunction = new MyFunction();
        Long result = myFunction.apply(3.7);
        System.out.println("Round value is " + result);

        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        System.out.println("Round value is " + function.apply(3.6));

        Function<Double, Long> longFunction = aDouble -> Math.round(aDouble);
        System.out.println("Round value is " + longFunction.apply(3.6));

        Function<Double, Double> cosFunction = aDouble -> Math.cos(aDouble);

        System.out.println("Cos 45 = " + cosFunction.apply(45.0));
        System.out.println("Cos 75 = " + cosFunction.apply(75.0));
        System.out.println("Cos 0 = " + cosFunction.apply(0.0));

    }
}
