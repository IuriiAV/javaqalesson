package com.qatelran.org.lessoneleven;

public class WomanDiscounter implements Discounter {

    @Override
    public void discount(int discount) {
        System.out.println("Woman discount = " + discount);
    }
}
