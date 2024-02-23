package com.qatelran.org.lessoneighteen;

import java.util.Date;

public class TestDate {

    public static void main(String[] args) {
        //1 Jan 1970
        //24342343545L

        Date currentDate = new Date();
        System.out.println("Current date is " + currentDate);

        Date dateOne = new Date(1L);
        System.out.println("Date is " + dateOne);

        System.out.println("Count of millis from " + currentDate +
                " is " + currentDate.getTime());

        Date date = new Date(2024 - 1900, 01, 13);
        System.out.println(date);

        Date currentDateOne = new Date();
        for (int i = 0; i < 1000000; i++) {
            int size = i;
        }
        Date currentDateTwo = new Date();
        long timeOne = currentDateOne.getTime();
        long timeTwo = currentDateTwo.getTime();
        System.out.println("difference is " + (timeTwo - timeOne));

        // after - проверяет что дата у которой он вызван больше чем дата в параметре метода
        boolean resultAfter = currentDateTwo.after(currentDateOne);
        System.out.println("Date two more than date one = " + resultAfter);
        // before - проверяет что дата у которой он вызван меньше чем дата в параметре метода
        boolean resultBefore = currentDateOne.before(currentDateTwo);
        System.out.println("Date one less than date two = " + resultBefore);

        int resultOne = currentDateOne.compareTo(currentDateTwo);
        System.out.println("Result of compare is " + resultOne);

        int resultTwo = currentDateTwo.compareTo(currentDateOne);
        System.out.println("Result of compare is " + resultTwo);

        System.out.println("Date two before settings is " + currentDateTwo);
        currentDateTwo.setTime(454545324554L);
        System.out.println("Date two after settings is " + currentDateTwo);
    }
}
