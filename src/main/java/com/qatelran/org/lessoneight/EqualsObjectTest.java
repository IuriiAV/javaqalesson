package com.qatelran.org.lessoneight;

public class EqualsObjectTest {

    public static void main(String[] args) {
        Cat catOne = new Cat(20, "Marsik");
        Cat catTwo = new Cat(20, "Marsik");

        boolean isEquals = catOne == catTwo;
        System.out.println(isEquals);
        // == does not work with references type
        if( catOne == catTwo) {
            System.out.println("Thea are equals");
        }

        if (catOne.equals(catTwo)) {
            System.out.println("They are equals with equals method");
        }

        if(catOne.equals(catOne)) {
            System.out.println("" +
                    "self equals with equals method");
        }

        Cat catThree = new Cat(19, "Marsik");
        if(catOne.equals(catThree)) {
            System.out.println("Hurra ! They are equals");
        }
    }
}
