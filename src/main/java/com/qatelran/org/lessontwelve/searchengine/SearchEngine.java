package com.qatelran.org.lessontwelve.searchengine;


public class SearchEngine {

    public static void main(String[] args) {

        //Сделать это дома

        Product jeans = new Product("Jeans");
        jeans.setType("Model");
        jeans.setColor("White");
        jeans.setFlavour("Strawberry");
        jeans.setSize("M");

        //5 product -> to ArrayList

        StringPredicate colorFilter = new StringPredicate("color", "White");
        StringPredicate sizeFilter = new StringPredicate("size", "L");
        //and



    }
}
