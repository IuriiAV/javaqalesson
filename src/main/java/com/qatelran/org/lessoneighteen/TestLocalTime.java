package com.qatelran.org.lessoneighteen;

import java.time.LocalTime;

public class TestLocalTime {

    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();
        int nano = currentTime.getNano();

        System.out.println("" + hour + " " + minute + " " + second + " " + nano);

        //каждое изменение даты возвращает новый объект
        currentTime = currentTime.plusHours(3);
        System.out.println(currentTime);
        currentTime = currentTime.minusMinutes(70);
        System.out.println(currentTime);

        LocalTime time = LocalTime.of(10, 20, 00, 00);
        System.out.println(time);
    }
}
