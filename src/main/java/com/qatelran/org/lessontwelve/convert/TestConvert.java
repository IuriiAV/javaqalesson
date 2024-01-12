package com.qatelran.org.lessontwelve.convert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestConvert {

    public static void main(String[] args) {
        // 1. Создать три - четыре объекта класса Человек
        // -----
        // 3. Список студентов, созданных на основании объектов людей

        List<Human> humanList = Arrays.asList(
                new Human("Alex", "Alexeev", 30),
                new Human("Oleg", "Olegov", 40),
                new Human("Maxim", "Maximov", 25)
        );

        Random random = new Random();

        // 1 option
        Function<Human, Student> converter = new Function<Human, Student>() {
            @Override
            public Student apply(Human human) {
                return new Student(human.getName() + " " + human.getSurname(),
                        human.getAge(), random.nextInt());
            }
        };

        // 2 option
        Function<Human, Student> converterOther = human -> new Student(human.getName() + " " + human.getSurname(),
                human.getAge(), random.nextInt());

        List<Student> students = new ArrayList<>();
        for (Human human : humanList) {
            students.add(converterOther.apply(human));
        }

        System.out.println(students);

        // 3 Stream api
        List<Student> collect = humanList.stream().map(converterOther).collect(Collectors.toList());

    }
}
