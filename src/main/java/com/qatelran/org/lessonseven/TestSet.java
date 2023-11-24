package com.qatelran.org.lessonseven;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSet {

    public static void main(String[] args) {
        // Set - interface (хранит элементы, нельзя хранить дубли элементов)
        // SortedSet
        // TreeSet - sorted set (поддерживает порядок сортировки)
        // HashSet - unsorted set (хранит элементы без какого либо порядка)

        // add - добавляет элемент в сет, возвращает ложь, если в сете уже есть такой элемент
        Set<String> sortedSet = new TreeSet<>();
        sortedSet.add("B");
        sortedSet.add("A");
        sortedSet.add("C");
        boolean result = sortedSet.add("A");
        System.out.println("Result to add double A " + result);

        System.out.println(sortedSet);

        // contains - проверяет наличие элемента в коллекции
        boolean containsResult = sortedSet.contains("C");
        System.out.println("Set contains C " + containsResult);

        boolean containsResultNot = sortedSet.contains("E");
        System.out.println("Set contains E " + containsResultNot);

        //SortedSet extends Set
        SortedSet<String> stringSortedSet = new TreeSet<>();
        stringSortedSet.add("B");
        stringSortedSet.add("A");
        stringSortedSet.add("C");
        stringSortedSet.add("A");
        System.out.println("Tree set : " + stringSortedSet);
        // first, last - получить первый и последний элемент, но только нужно объявить
        // интерфейс не Set, a SortedSet
        System.out.println("First element " + stringSortedSet.first());
        System.out.println("Last element " + stringSortedSet.last());

        //remove - удаляет элемент из коллекции
        System.out.println(sortedSet);
        System.out.println(stringSortedSet);

        sortedSet.remove("A");
        stringSortedSet.remove("C");

        System.out.println(sortedSet);
        System.out.println(stringSortedSet);

        for(String value : sortedSet) {
            System.out.println(" element " + value);
        }

        Person person = new Person();
        Person personOne = new Person();
        Set<Person> personSet = new TreeSet<>();
        personSet.add(person);
        personSet.add(personOne);

        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(2);
        integerSet.add(4);
        integerSet.add(1);
        integerSet.add(0);
        System.out.println(integerSet);
    }
}
