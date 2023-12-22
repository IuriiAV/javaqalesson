package com.qatelran.org.lessoneleven;

public class ExampleAboutInt {

    public static void main(String[] args) {
        IntegerOperationImpl operationOne = new IntegerOperationImpl();
        doSomething(operationOne);
    }

    private static void doSomething(IntegerOperationImpl operation) {
        operation.multiply(6);
    }
}
