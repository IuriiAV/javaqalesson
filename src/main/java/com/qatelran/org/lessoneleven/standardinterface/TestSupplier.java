package com.qatelran.org.lessoneleven.standardinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class TestSupplier {

    public static void main(String[] args) {
        // Supplier - метод get ничего не принимает, а только возвращает объекты указанного типа
        System.out.println(getRandom());
        System.out.println(getRandom());
        System.out.println(getRandom());
        System.out.println();
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        Supplier<Person> personGenerator = new Supplier<Person>() {
            @Override
            public Person get() {
                return new Person();
            }
        };

        Person person = personGenerator.get();

        Supplier<Person> personGeneratorAsLambda = () -> new Person();
        Person person1 = personGeneratorAsLambda.get();

        Supplier<List<Person>> listSupplier = () ->
                Arrays.asList(
                        personGeneratorAsLambda.get(),
                        personGeneratorAsLambda.get(),
                        personGeneratorAsLambda.get(),
                        personGeneratorAsLambda.get()
                );


        List<Person> people = listSupplier.get();

    }

    private static Double getRandom() {
        return Math.random();
    }
}
