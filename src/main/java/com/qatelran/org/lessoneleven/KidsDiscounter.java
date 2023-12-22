package com.qatelran.org.lessoneleven;

public class KidsDiscounter implements Discounter {

    @Override
    public void discount(int discount) {
        System.out.println("Kids discount = " + discount);
    }
}
