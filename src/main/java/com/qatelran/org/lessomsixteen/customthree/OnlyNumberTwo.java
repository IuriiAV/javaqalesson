package com.qatelran.org.lessomsixteen.customthree;

public class OnlyNumberTwo<T extends Number, U extends Number> {

    private T numberOne;

    private U numberTwo;

    public OnlyNumberTwo(T numberOne, U numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public void printSum() {
        System.out.println(numberOne + "" + numberTwo);
    }
}
