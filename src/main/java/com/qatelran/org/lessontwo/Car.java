package com.qatelran.org.lessontwo;

public class Car {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void tank() {
        System.out.println("Fill the car " + name + " with gasoline");
    }
}
