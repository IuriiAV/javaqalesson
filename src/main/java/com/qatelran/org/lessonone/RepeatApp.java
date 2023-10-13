package com.qatelran.org.lessonone;

public class RepeatApp {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alex");

        Person personOne = new Person();
        personOne.setName("Oleg");

        System.out.println("Name = " + person.getName());
        System.out.println(personOne);
    }
}
