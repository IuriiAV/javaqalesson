package com.qatelran.org.lessoneighteen;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class TestLocalDate {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // new Date()
        System.out.println(date);

        int year = date.getYear();
        Month month = date.getMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfMonth = date.getDayOfMonth();
        System.out.println("" + year + " " + month + " " + dayOfWeek + " " + dayOfMonth);

        LocalDate dateOne = LocalDate.of(2024, 1, 15);
        System.out.println(dateOne);
        System.out.println("Month " + dateOne.getMonth());

        //каждое изменение даты возвращает новый объект
        //        LocalDate dateTwo = dateOne.plusYears(2);
        //        System.out.println(dateOne);
        //        System.out.println(dateTwo);

        dateOne = dateOne.plusYears(2);
        dateOne = dateOne.plusDays(15);
        dateOne = dateOne.plusMonths(3);
        System.out.println(dateOne);

        dateOne = dateOne.minusDays(6);
        dateOne = dateOne.minusYears(4);
        System.out.println(dateOne);

        boolean before = date.isBefore(dateOne);
        System.out.println("Date " + date + " is before " + dateOne + " = " + before);

        boolean after = date.isAfter(dateOne);
        System.out.println("Date " + date + " is before " + dateOne + " = " + after);

        System.out.println("Is leap year " + date + " = " + date.isLeapYear());
    }
}
