package com.qatelran.org.lessonten;

import java.util.HashMap;
import java.util.Map;

public class TestMapExampleOne {

    public static void main(String[] args) {
        String text = "sdjfdkjjh sdfskff sdfdsfrref erfsdfsd sdfsdfrfrsdfs frtrrbgb  kjie";
        // s - 100,
        // d - 20,
        // k - 35
        // char - Character

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i); // взяли элемент из строки по индексу
            if (map.containsKey(temp)) { // проверили что элемент есть в мап
                Integer value = map.get(temp); // взяли значение хранимое для этого элемента
                map.put(temp, value + 1); // и поместили обратно, увеличенное на 1
            } else {
                map.put(temp, 1); // поместили элемент со значением 1
            }
        }

        //Option one to iterate all elements
        map.forEach((key, value) -> {
            System.out.println("Symbol  " + key + " contains " + value + " times");
        });

        //Option two to iterate all elements
        //for (Map.Entry<Character, Integer> pair : map.entrySet()) {
        //System.out.println("Symbol  " + pair.getKey() + " contains " + pair.getValue() + " times");
        //}
    }
}
