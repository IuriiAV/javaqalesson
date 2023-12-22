package com.qatelran.org.lessoneleven;

import java.util.Scanner;

public class DiscounterAppWithLambda {

    public static void main(String[] args) {
        int day;
        System.out.println("Input special day : ");
        Scanner scanner = new Scanner(System.in);
        day = scanner.nextInt();

//        Discounter womanDiscounter = new Discounter() {
//            @Override
//            public void discount(int discount) {
//                System.out.println("Woman discount = " + discount);
//            }
//        };

        Discounter womanDiscounter = discount ->
                System.out.println("Woman discount = " + discount);

//        Discounter manDiscounter = new Discounter() {
//            @Override
//            public void discount(int discount) {
//                System.out.println("Man discount = " + discount);
//            }
//        };
        Discounter manDiscounter = discount ->
                System.out.println("Man discount = " + discount);

//        Discounter kidsDiscounter = new Discounter() {
//            @Override
//            public void discount(int discount) {
//                System.out.println("Kids discount = " + discount);
//            }
//        };

        Discounter kidsDiscounter = (discount) ->
                System.out.println("Kids discount = " + discount);


        DiscounterAdditional discounterAdditional = (discount, maxPrice) ->
                System.out.println("Discount = " + discount + " max price " + maxPrice);

        DiscounterAdditinalWP additinalWP = () -> System.out.println("Discount");

        if (day == 8) {
            applyDiscount(womanDiscounter, 30);
        }
        if (day == 23) {
            applyDiscount(manDiscounter, 15);
        }
        if (day == 15) {
            applyDiscount(kidsDiscounter, 60);
        }

        scanner.close();
    }

    private static void applyDiscount(Discounter discounter, int discountSize) {
        discounter.discount(discountSize);
    }
}
