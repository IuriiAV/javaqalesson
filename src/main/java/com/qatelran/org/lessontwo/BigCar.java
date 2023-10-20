package com.qatelran.org.lessontwo;

public class BigCar extends Car {

    @Override
    public void tank() {
        //super.tank(); // super - link to parent
        //System.out.println("Fill the car " + super.getName() + " with diesel");
        System.out.println("Fill the car " + name + " with diesel");
    }
}
