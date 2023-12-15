package com.qatelran.org.lessonten.maptest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DoctorTest {

    public static void main(String[] args) {
        // Petrov, Maximov, Olegov
        //key - doctor, value - work or not

        Map<String, Boolean> map = new HashMap<>();
        map.put("petrov", true);
        map.put("maximov", false);
        map.put("olegov", true);

        checkDoctorsAvailable(map);
    }

    private static void checkDoctorsAvailable(Map<String, Boolean> map) {
        System.out.println("Enter doctor's surname :");
        Scanner scanner = new Scanner(System.in);
        String surname = scanner.next().toLowerCase();
        if (map.containsKey(surname)) {
            Boolean isWork = map.get(surname);
            System.out.println("Doctor " + surname + " works today :" + isWork);
        } else {
            System.out.println("There is no doctor with this surname");
        }
    }

    private static void printAllDoctorsSchedule(Map<String, Boolean> map) {
        map.forEach((doctor, works) -> {
            System.out.println("Doctor " + doctor + " works today : " + works);
        });
    }
}
