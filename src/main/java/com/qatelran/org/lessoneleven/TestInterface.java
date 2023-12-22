package com.qatelran.org.lessoneleven;

public class TestInterface {

    public static void main(String[] args) {
        //Standard realization
        IntegerOperation integerOperation = new IntegerOperationImpl();
        integerOperation.multiply(45);

        IntegerOperationImplAdd integerOperationImplAdd = new IntegerOperationImplAdd();
        integerOperationImplAdd.multiply(9);

        //Use Functional Interface
        //В данном коде сразу создаем объект, который реализует интерфейс
        //и сразу делает его имплементацию

        //SomeClass implements IntegerOperation {  аналог new IntegerOperation() {

        //}
        IntegerOperation operation = new IntegerOperation() {
            @Override
            public void multiply(int a) {
                System.out.println(a * 2);
            }
        };
        operation.multiply(30);
        IntegerOperation operationAsLambda = a -> System.out.println(a * 2);

        //
        IntegerOperation operationMultiplyThree = new IntegerOperation() {
            @Override
            public void multiply(int a) {
                System.out.println(a * 3);
            }
        };
        operationMultiplyThree.multiply(5);
        IntegerOperation operationMultiplyThreeAsLambda = a -> System.out.println(a * 5);

        IntegerOperation operationMultiplyFour = new IntegerOperation() {
            @Override
            public void multiply(int a) {
                System.out.println(a * 4);
            }
        };
        operationMultiplyFour.multiply(7);

        //Short form use lambda
        IntegerOperation operationMultThree = a -> System.out.println(a * 3);

        operationMultThree.multiply(8);

    }
}
