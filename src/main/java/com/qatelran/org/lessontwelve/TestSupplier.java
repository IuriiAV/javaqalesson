package com.qatelran.org.lessontwelve;

import java.util.Random;
import java.util.function.*;

public class TestSupplier {

    public static void main(String[] args) {
        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        String example = "Example";

        Supplier<String> stringSupplier = () -> example.toUpperCase();
        System.out.println(stringSupplier.get());

        Random random = new Random();
        IntSupplier intSupplier = () -> random.nextInt(100);
        DoubleSupplier doubleSupplier = () -> random.nextDouble();
        LongSupplier longSupplier = () -> random.nextLong();
        BooleanSupplier booleanSupplier = () -> random.nextBoolean();

        System.out.println(intSupplier.getAsInt());
        System.out.println(doubleSupplier.getAsDouble());
        System.out.println(longSupplier.getAsLong());
        System.out.println(booleanSupplier.getAsBoolean());

    }
}
