package com.qatelran.org.lessoneight.comparing;

import java.util.Comparator;

public class CustomAgeComparator implements Comparator<Student> {
    //                0        -1      1
    // o1 and o2 (o1 == o2, o1 < o2, o2 < o1)

    @Override
    public int compare(Student o1, Student o2) {
        //int ageOne = o1.getAge();
        //int ageTwo = o2.getAge();
        //return ageOne - ageTwo;

        return o1.getAge() - o2.getAge();
    }
}
