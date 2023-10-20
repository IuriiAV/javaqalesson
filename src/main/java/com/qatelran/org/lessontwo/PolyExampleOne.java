package com.qatelran.org.lessontwo;

import java.util.Scanner;

public class PolyExampleOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number one");
        String oneIn = scanner.next();
        System.out.println("Please input number two");
        String twoIn = scanner.next();

        if (oneIn.contains(".")) {
            /* option one
            double one = Double.parseDouble(oneIn);
            double two = Double.parseDouble(twoIn);
            System.out.println("Your a * b = " + multiply(one, two));
            */
            System.out.println("Your a * b = " + multiply(Double.parseDouble(oneIn),
                    Double.parseDouble(twoIn)));
        } else {
            /* option one
            int one = Integer.parseInt(oneIn);
            int two = Integer.parseInt(twoIn);
            System.out.println("Your a * b = " + multiply(one, two));
             */
            System.out.println("Your a * b = " + multiply(Integer.parseInt(oneIn),
                    Integer.parseInt(twoIn)));
        }
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }
}
