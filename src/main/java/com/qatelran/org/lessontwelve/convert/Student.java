package com.qatelran.org.lessontwelve.convert;

public class Student {

    private String fio; // name + surname

    private int age;

    private int id;

    public Student(String fio, int age, int id) {
        this.fio = fio;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
