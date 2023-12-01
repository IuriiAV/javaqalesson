package com.qatelran.org.lessoneight.comparing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentTest {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Oleg", 20, 5),
                new Student("Alex", 25, 3),
                new Student("Maxim", 30, 4),
                new Student("Petr", 17, 2));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        CustomAgeComparator customAgeComparator = new CustomAgeComparator();
        Collections.sort(students, customAgeComparator);

        Iterator<Student> iteratorTwo = students.iterator();
        while (iteratorTwo.hasNext()) {
            System.out.println(iteratorTwo.next());
        }
    }
}
