package com.qatelran.org.lessoneight.comparing;

import java.util.*;

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
        System.out.println();

        Collections.sort(students, new CustomRateComparator());
        Iterator<Student> iteratorThree = students.iterator();
        while (iteratorThree.hasNext()) {
            System.out.println(iteratorThree.next());
        }
        System.out.println();

        Collections.sort(students, new CustomNameComparator());
        Iterator<Student> iteratorFour = students.iterator();
        while (iteratorFour.hasNext()) {
            System.out.println(iteratorFour.next());
        }

        System.out.println();

        Set<Student> treeSet = new TreeSet<>(new CustomRateComparator());
        treeSet.add(new Student("Oleg", 20, 5));
        treeSet.add(new Student("Alex", 25, 3));
        treeSet.add(new Student("Petr", 17, 2));

        System.out.println(treeSet);

        //Collections.sort(students,(Comparator.comparingInt(Student::getAge)));
        //Collections.sort(students,Comparator.comparing(Student::getName));

    }
}
