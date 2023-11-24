package com.qatelran.org.lessonseven;

import java.util.*;
import java.util.stream.Collectors;

public class TestHashSet {

    public static void main(String[] args) {
        // Set - interface (хранит элементы, нельзя хранить дубли элементов)
        // SortedSet
        // TreeSet - sorted set (поддерживает порядок сортировки) ; Time complexity (O(logn))
        // HashSet - unsorted set (хранит элементы без какого либо порядка); Time complexity ( O(1) )
        // Внутри Хэшсета создается объект ХэшМап
        // Внутри ХэшМап - массив элементов определенного типа
        // [] -> linked list
        // [] -> linked list
        // [] -> linked list
        // [] -> linked list
        // [] -> linked list
        // [] -> linked list

        //"C" -> hashCode -> (hashCode,length) -> search position (index)
        // -> go by index -> if not exist -> create ll -> head of ll -> "C"
        // reference for ll put to array[index]

        //contains - > "C" -> hashCode -> (hashCode,length) -> search position (index)
        // -> go by index -> ll equals "C";

        Set<String> stringSet = new HashSet<>(); // inside HashMap
        stringSet.add("C");
        stringSet.add("E");
        stringSet.add("BC");
        stringSet.add("A");
        System.out.println(stringSet);

        //Хэш-код это целое число, которое является идентификатором содержимого объекта

        //Если хэш код одинаковый у всех элементов, то они соберутся в одной ячейке в виде
        //связного списка - это проблема!!!

        Integer[] ints = {3, 2, 5, 7, 6, 9, 10};
        System.out.println("Option one " + convertArrayToSetOne(ints));

        System.out.println("Option two " + convertArrayToSetTwo(ints));

        System.out.println("Option three " + convertArrayToSetThree(ints));

        System.out.println("Option four " + convertArrayToSetFour(ints));

        System.out.println("Option five " + convertArrayToSetFive(ints));

        //isEmpty(), clear(), iterator(), size()
        Set<Integer> integerSet = convertArrayToSetFour(ints);
        //iterator
        Iterator<Integer> iterator = integerSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static Set<Integer> convertArrayToSetFive(Integer[] array) {
        //use only unique values
        Set<Integer> integerSet = new HashSet<>(Set.of(array));
        return integerSet;
    }

    private static Set<Integer> convertArrayToSetFour(Integer[] array) {
        return Arrays.stream(array).collect(Collectors.toSet());
    }

    private static Set<Integer> convertArrayToSetThree(Integer[] array) {
        Set<Integer> integerSet = new HashSet<>();
        Collections.addAll(integerSet, array);
        return integerSet;
    }

    private static Set<Integer> convertArrayToSetTwo(Integer[] array) {
        Set<Integer> integerSet = new HashSet<>(Arrays.asList(array));
        return integerSet;
    }

    private static Set<Integer> convertArrayToSetOne(Integer[] array) {
        Set<Integer> integerSet = new HashSet<>();
        for (int element : array) {
            integerSet.add(element);
        }
        return integerSet;
    }
}
