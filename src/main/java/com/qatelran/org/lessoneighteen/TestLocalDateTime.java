package com.qatelran.org.lessoneighteen;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestLocalDateTime {

    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        int hour = currentDateTime.getHour();
        int year = currentDateTime.getYear();

        currentDateTime = currentDateTime.plusDays(10);
        currentDateTime = currentDateTime.minusMinutes(40);

        LocalDate date = currentDateTime.toLocalDate();
        LocalTime time = currentDateTime.toLocalTime();
        System.out.println(date);
        System.out.println(time);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime newDateTime = now.plusYears(2)
                .minusMinutes(16)
                .minusDays(45)
                .plusHours(10)
                .plusSeconds(150);
        System.out.println(newDateTime);
    }
}
