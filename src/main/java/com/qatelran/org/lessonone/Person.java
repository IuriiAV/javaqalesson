package com.qatelran.org.lessonone;

public class Person {

    private String name;

    public void printGreetings() {
        System.out.println("Hello I am " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                '}';
    }
}
