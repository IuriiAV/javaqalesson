package com.qatelran.org.lessonfive;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestRemoveError {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i ++) {
            list.add(i);
        }
        System.out.println(list);

        // Incorrect - java.util.ConcurrentModificationException
        // Исключение возникает при попытке изменить коллекцию во время итерации по ней
        //        for(Integer element : list) {
        //            if( element % 2 != 0 ) {
        //                list.remove(element);
        //            }
        //        }
        //        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if( element % 2 != 0 ) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
