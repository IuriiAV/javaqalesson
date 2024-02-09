package com.qatelran.org.lessomsixteen.customtwo;

public class Test<T,U> {

    private T paramOne;  // private Object paramOne;

    private U paramTwo;  // private Object paramTwo;

    public Test(T paramOne, U paramTwo) { // public Test(Object paramOne, Object paramTwo) {
        this.paramOne = paramOne;
        this.paramTwo = paramTwo;
    }

    public void print() {
        System.out.println("Param one " + paramOne);
        System.out.println("Param two " + paramTwo);
    }

    public T getParamOne() {  // public Object getParamOne() {
        return paramOne;
    }

    public U getParamTwo() { // public Object getParamTwo() {
        return paramTwo;
    }
}
