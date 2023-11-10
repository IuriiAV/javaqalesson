package com.qatelran.org.lessonfive;

public class TestEquals {

    public static void main(String[] args) {

        String one = "Hi!";
        String two = "Hello";

        System.out.println("String : " + one + " : contains Hello ? = " + checkHello(one));
        System.out.println("String : " + two + " : contains Hello ? = " + checkHello(two));

        String three = null;
        System.out.println("String : " + three + " : contains Hello ? = " + checkHello(three));

    }

    private static boolean checkHello(String str) {
        //if (str.equals("Hello")) { - incorrect
        if ("Hello".equals(str)) {
            return true;
        }

        return false;
    }
}
