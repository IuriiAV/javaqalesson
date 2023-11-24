package com.qatelran.org.lessonseven;

import java.util.HashSet;
import java.util.Set;

public class TestHashSetTask {

    public static void main(String[] args) {
        //charAt(index) - get by index
        String original = "sjdhfkjdfhdkfjhwke fjwelfoijdso fijasdlsdfsdf";
        char[] charArray = original.toCharArray();
        Set<Character> characterSet = new HashSet<>();

        //        //First option
        //        for(int i = 0; i < charArray.length; i++) {
        //            characterSet.add(charArray[i]);
        //        }

        //Second option
        for (char element : charArray) {
            characterSet.add(element);
        }

        System.out.println("Count of unique chars " + characterSet.size() + " for string size " + original.length());
        System.out.println(characterSet);
    }
}
