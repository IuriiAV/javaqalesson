package com.qatelran.org.lessomsixteen.custom;

public class Test<T> {

    private T obj;  // private Object obj;

    private String name;

    public Test(T obj, String name) {   // public Test(Object obj, String name) {
        this.obj = obj;
        this.name = name;
    }

    public Test(T obj) {  // public Test(Object obj) {
        this.obj = obj;
    }

    public T getObj() {  // public Object getObj()
        return obj;
    }
}
