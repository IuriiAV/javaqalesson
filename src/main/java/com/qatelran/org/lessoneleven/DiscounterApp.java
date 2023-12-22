package com.qatelran.org.lessoneleven;

import java.util.Scanner;

public class DiscounterApp {

    public static void main(String[] args) {

        int day;
        System.out.println("Input special day : ");
        Scanner scanner = new Scanner(System.in);
        day = scanner.nextInt();

        if (day == 8) {
            applyDiscount(new WomanDiscounter(), 30);
        }
        if (day == 23) {
            applyDiscount(new ManDiscounter(), 15);
        }
        if (day == 15) {
            applyDiscount(new KidsDiscounter(), 60);
        }

        scanner.close();
    }

    private static void applyDiscount(Discounter discounter, int discountSize) {
        discounter.discount(discountSize);
    }
}