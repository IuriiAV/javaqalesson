package com.qatelran.org.lessoneight.comparing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DogTest {

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(
                new Dog("Murzik", 10),
                new Dog("Barsik", 5),
                new Dog("Funtik", 12));


        Collections.sort(dogs);
    }
}
