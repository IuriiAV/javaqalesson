package com.qatelran.org.lessomsixteen.custom;

public class MainApp {

    public static void main(String[] args) {
        TestInteger testOne = new TestInteger(15);
        System.out.println(testOne.getObj());
        Integer obj = testOne.getObj();

        TestString testTwo = new TestString("Hello");
        System.out.println(testTwo.getObj());
        String obj1 = testTwo.getObj();

        TestObject testThree = new TestObject(15);
        System.out.println(testThree.getObj());
        Object obj2 = testThree.getObj();

        TestObject testFour = new TestObject("Hello");
        System.out.println(testFour.getObj());
        Object obj3 = testFour.getObj();

        //Test testFive = new Test((String)"Hello");
        //String obj4 = (String) testFive.getObj();

        Test<String> testFive = new Test<>("Hello");
        String obj4 = testFive.getObj();
        System.out.println(obj4);

        Test<Integer> testSix = new Test<>(15);
        Integer obj5 = testSix.getObj();
        System.out.println(obj5);
    }
}
