package com.qatelran.org.lessomsixteen;

import java.util.ArrayList;
import java.util.List;

public class TestParam {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Java");
        list.add("Collection");
        list.add(2);

        for (Object element : list) {
            String elementString = (String) element;
            System.out.println(elementString);
        }

        List<String> stringList = new ArrayList<>(); // List stringList = new ArrayList();
        stringList.add("Java"); // stringList.add((String) "Java"));
        //stringList.add(2);
        String s = stringList.get(0); // String s = (String) stringList.get(0);
    }
}
