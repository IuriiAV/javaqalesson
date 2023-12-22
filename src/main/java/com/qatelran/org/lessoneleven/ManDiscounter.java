package com.qatelran.org.lessoneleven;

public class ManDiscounter implements Discounter {

    @Override
    public void discount(int discount) {
        System.out.println("Man discount = " + discount);
    }
}
