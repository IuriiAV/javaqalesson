package com.qatelran.org.lessomsixteen.pecs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPECS {

    public static void main(String[] args) {
        StudentPerson alex = new StudentPerson("Alex");
        StudentPerson oleg = new StudentPerson("Oleg");
        Person max = new Person("Max");

        List<Person> people = new ArrayList<>(Arrays.asList(alex, oleg, max));
        List<StudentPerson> studentPeople = new ArrayList<>(Arrays.asList(alex, oleg));
        modifyPersonList(people);

        //modifyPersonList(studentPeople);

        modifyPersonListAdd(studentPeople);
        modifyPersonListAdd(people);

        printChildList(studentPeople);
        printChildList(people);
    }

    //PECS - Producer extends, Consumer super
    // ? extends SomeClass - принимает любой тип данных, который является наследником класса
    // ? super Someclass - принимает любой тип данных, который является родителем класса

    // people - producer (из него что-то читаем) - используем extends
    private static void printChildList(List<? extends Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
    //people - consumer (в него что-то добавляем) используем super
    private static void modifyPersonListAdd(List<? super StudentPerson> people) {
        StudentPerson gena = new StudentPerson("Gena");
        people.add(gena);
    }

    private static void modifyPersonList(List<Person> people) {
        StudentPerson gena = new StudentPerson("Gena");
        people.add(gena);
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
