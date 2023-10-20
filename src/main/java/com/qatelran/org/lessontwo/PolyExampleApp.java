package com.qatelran.org.lessontwo;

//Example app with poly
public class PolyExampleApp {

    public static void main(String[] args) {
        //Overloading

        int a = 5;
        int b = 10;
        int c = 4;
        int sumOne = sum(a, b);
        printSum(sumOne);

        int sumTwo = sum(a, b, c);
        printSum(sumTwo);

        double sumThree = sum(2.0, 3.0);
        printSum(sumThree);

        double sumFour = sum(3.0, 4);
        printSum(sumFour);

    }

    private static void printSum(int sum) {
        System.out.println(sum);
    }

    private static void printSum(double sum) {
        System.out.println(sum);
    }

    private static int sum(int a, int b) {
       return a+b;
    }

    private static double sum(double a, int b) {
        return a + b;
    }

    private static double sum(double a, double b) {
        return a + b;
    }

    private static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
