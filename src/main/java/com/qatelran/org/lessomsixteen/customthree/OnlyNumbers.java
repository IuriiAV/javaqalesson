package com.qatelran.org.lessomsixteen.customthree;

public class OnlyNumbers<T extends Number> {

    private T number;

    public OnlyNumbers(T number) {
        this.number = number;
    }

    public void print() {
        System.out.println(number);
    }
}
