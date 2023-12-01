package com.qatelran.org.lessoneight;

public class PersonTest {

    public static void main(String[] args) {
        Address address = new Address("New-York");
        Person personOne = new Person(1972, address);
        Person personTwo = new Person(1972, address);

        if (personOne.equals(personTwo)) {
            System.out.println("They are equals");
        }
    }
}
