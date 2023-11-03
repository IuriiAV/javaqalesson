package com.qatelran.org.lessonfour;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListFour {

    public static void main(String[] args) {
        //Дан список значений (строки), перевести все строки в нижний регистр
        List<String> listOne = new ArrayList<>();
        listOne.add("Red");
        listOne.add("Green");
        listOne.add("White");
        listOne.add("Black");
        System.out.println("Original list = " + listOne);
        List<String> list = convertToLowerCase(listOne);
        System.out.println("List with strings in lower case = " + list);
    }

    private static List<String> convertToLowerCase(List<String> list) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
//            String oldValue = list.get(i);
//            String newValue = oldValue.toLowerCase();
//            stringList.add(newValue);
              stringList.add(list.get(i).toLowerCase());
        }
        return stringList;
    }
}
