package com.qatelran.org.lessomsixteen.customtwo;

import com.qatelran.org.lessonone.Person;

public class TestApp {

    public static void main(String[] args) {
        Test<String, String> testOne = new Test<>("Hello", "World");
        testOne.print();

        Test<String,Integer> testTwo = new Test<>("Hello", 15);
        testTwo.print();

        Test<Person, String> testThree = new Test<>(new Person(), "Hello");
        testThree.print();

        Test<Integer, Integer> testFour = new Test<>(10,5);

        Test<String, Integer> testSix = new Test<>("Hello", 10);
        String paramOne = testSix.getParamOne();

        String upperOne = ((String) paramOne).toUpperCase();

        Integer paramTwo = testSix.getParamTwo();
        //String upperTwo = ((String) paramTwo).toUpperCase(); - incorrect!!!!

        Test testSeven = new Test("rrr",55);
        Object paramOne1 = testSeven.getParamOne();


    }
}
