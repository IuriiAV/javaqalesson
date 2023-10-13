package com.qatelran.org.lessonone;

public class AnimalApp {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Elephant elephant = new Elephant();
        Airplane airplane = new Airplane();

        Flyable[] flyables = {elephant, airplane, cat};

        for (Flyable flyable : flyables) {
            flyable.fly();
        }

//        goCat(cat);
//        goEl(elephant);
//        goAir(airplane);

        go(airplane);
        go(elephant);
        go(cat);

        for (Flyable flyable : flyables) {
            go(flyable);
        }

    }

    private static void go(Flyable flyable) {
        System.out.println("Hello I am fly");
        flyable.fly();
    }

//    private static void goCat(Cat cat) {
//        cat.fly();
//    }
//
//    private static void goEl(Elephant elephant) {
//        elephant.fly();
//    }
//
//    private static void goAir(Airplane airplane) {
//        airplane.fly();
//    }
}
