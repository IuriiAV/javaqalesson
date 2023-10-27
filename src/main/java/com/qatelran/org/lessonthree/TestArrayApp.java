package com.qatelran.org.lessonthree;

import java.util.Arrays;

public class TestArrayApp {

    public static void main(String[] args) {
        // 4*5  // ->____ ____ ____ ____
        //reserve name for variable and init array after it
        int[] ints;
        ints = new int[5];

        int a = ints[2];
        //reserve name for variable and init array
        // size of array always "int" type
        int[] intsOne = new int[5];
        // inti array with data
        int[] intTwo = new int[]{1, 2, 3, 4, 5};
        int[] intThree = {1, 2, 3, 4, 5};

        String[] strings = {"One", "Two", "Three"};

        //Create three objects Person and add them in array
        Person[] people = {new Person(), new Person(), new Person()};
        Person personTwo = people[1];

        //взятие элемента по индексу
        int value = intThree[4];
        intThree[3] = 3;
        //Обход элементов массива
        for (int i = 0; i < intThree.length; i++) {
            System.out.println("Element by index  = " + i + " , element = " + intThree[i]);
        }
        //Альтернативный вариант цикла foreach
        for (int val : intThree) {
            System.out.println("Element  = " + val);
        }
        for (String str : strings) {
            System.out.println("Element of string array = " + str);
        }

        //Arrays - вспомогательный класс в нем есть много методов для
        //работы с массивами
        //например toString возвращает представление массива как строка
        //сам массив остается в неизменном виде
        String arrayAsString = Arrays.toString(intThree);
        System.out.println(arrayAsString);

        //sort - изменяет текущий массив, сортирует массив
        //QuickSort
        int[] intsFour = {5,4,7,3,2,9,0};
        System.out.println("Array before sort "+Arrays.toString(intsFour));
        Arrays.sort(intsFour);
        System.out.println("Array after sort "+Arrays.toString(intsFour));

    }
}
