package com.qatelran.org.lessonten;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AnotherMapTest {

    public static void main(String[] args) {
        //Поддерживает порядок добавления элементов
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("a", 100);
        map.put("c", 300);
        map.put("b", 200);
        map.put("d", 400);
        map.put("e", 300);
        System.out.println(map);

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("a", 100);
        treeMap.put("c", 300);
        treeMap.put("b", 200);
        treeMap.put("d", 400);
        treeMap.put("e", 300);
        System.out.println(treeMap);
    }
}
