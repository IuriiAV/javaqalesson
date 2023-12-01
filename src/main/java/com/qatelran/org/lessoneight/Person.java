package com.qatelran.org.lessoneight;

import java.util.Objects;

public class Person {

    private int year;

    private Address address;

    public Person(int year, Address address) {
        this.year = year;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return year == person.year && address.equals(person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, address);
    }

    //    @Override
//    public boolean equals(Object obj) {
//        //1
//        if (this == obj) {
//            return true;
//        }
//        //2
//        if(obj == null) {
//            return false;
//        }
//        //3
//        if(!(obj instanceof Person)){
//            return false;
//        }
//        //4
//        Person person = (Person) obj;
//        return this.year == person.year && this.address.equals(person.address) ;
//    }
}
