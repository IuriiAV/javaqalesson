package com.qatelran.org.lessoneleven;

public class ExampleApp {

    public static void main(String[] args) {
        ExampleInterface exampleInterface = new ExampleInterface() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }

            @Override
            public int sub(int a, int b) {
                return a - b;
            }
        };

        System.out.println(exampleInterface.add(5,6));
        System.out.println(exampleInterface.sub(4,7));
    }
}
