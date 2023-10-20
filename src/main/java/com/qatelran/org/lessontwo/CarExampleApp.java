package com.qatelran.org.lessontwo;

public class CarExampleApp {

    public static void main(String[] args) {
        BigCar bigCar = new BigCar();
        SmallCar smallCar = new SmallCar();

        bigCar.setName("Tatra");
        smallCar.setName("Opel");

        // bigCar.tank();
        // smallCar.tank();

        Bus bus = new Bus();
        bus.setName("Autobus");
        //  bus.tank();


        /*
         Car
          ^
         BigCar
          ^
          Bus
         */

        LittleCar littleCar = new LittleCar();
        littleCar.setName("Little");

        fillCar(bigCar);
        fillCar(smallCar);
        fillCar(bus);
        fillCar(littleCar);

        Car[] cars = {bigCar,smallCar,bus,littleCar};
        for(int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            car.tank();
        }
    }

    private static void fillCar(Car auto) {
        System.out.println("Now I will fill car ");
        auto.tank();
    }

//    private static void fillCar(BigCar auto) {
//        auto.tank();
//    }
//
//    private static void fillCar(SmallCar auto) {
//        auto.tank();
//    }
//
//    private static void fillCar(Bus auto) {
//        auto.tank();
//    }
}
