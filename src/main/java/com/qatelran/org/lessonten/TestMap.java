package com.qatelran.org.lessonten;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        // Map
        //  key -> value
        //  HashMap -> хранит значения без какого либо порядка
        Map<String, Integer> map = new HashMap<>();
        // put - помещает элементы в хешмап
        map.put("a", 100);
        map.put("c", 300);
        map.put("b", 200);
        map.put("d", 400);
        map.put("e", 300);
        map.put("b", 500);

        //foreach
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println("Key = " + pair.getKey() + " , value = " + pair.getValue());
        }

        //get - получает элементы из мап
        Integer integer = map.get("d");
        System.out.println("Value for key d = " + integer);

        //containsKey - проверяет наличие ключа в мап
        boolean c = map.containsKey("c");
        boolean t = map.containsKey("t");
        System.out.println("Map contains c key = " + c);
        System.out.println("Map contains t key = " + t);

        // put, get, containsKey  - Time complexity O(1)

        List<Person> people = Arrays.asList(
                new Person(), new Person()
        );

        for(Person person : people) {
            if (person.surname.equals("Ivanov")) {
                System.out.println("Found");
            }
        }

        Person person = new Person();
        Person person1 = new Person();

        Map<String, Person> personMap = new HashMap<>();
        personMap.put(person.surname, person);
        personMap.put(person1.surname, person1);

        Person person2 = personMap.get("Ivanov");

    }
}
