package com.qatelran.org.lessontwelve.searchengine;

import java.util.function.Predicate;

public class StringPredicate implements Predicate<Product> {

    private String key;

    private String referenceValue;

    public StringPredicate(String key, String referenceValue) {
        this.key = key;
        this.referenceValue = referenceValue;
    }

    @Override
    public boolean test(Product product) {
        // - взять свойства передаваемого продукта и
        // сравнить их с теми условиями, что вы передаете
        return false;
    }
}
