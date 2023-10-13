package com.qatelran.org.lessonone;

public class PartyApp {

    public static void main(String[] args) {
        Person man = new Man();
        man.setName("Alex");
        //man.printHello();

        Person woman = new Woman();
        woman.setName("Elena");

        Person child = new Child();
        child.setName("Max");

        Person junior = new Junior();
        junior.setName("Petr");

        Person[] people = {man, woman, child, junior};

        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            person.printGreetings();

        }


//        //Example
//        for(Person person : people) {
//            person.printGreetings();
//        }
    }
}
