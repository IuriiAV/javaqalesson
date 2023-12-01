package com.qatelran.org.lessoneight;

public class EqualsTest {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        boolean isEquals = a == b;
        System.out.println(isEquals);

        int c = 1;
        Integer d = Integer.valueOf(1);
        boolean isEqualsPrimitiveAndReference = c == d;
        System.out.println(isEqualsPrimitiveAndReference);
    }
}
