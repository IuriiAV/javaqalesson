package com.qatelran.org.lessomsixteen.customthree;

public class OnlyNumberApp {

    public static void main(String[] args) {
        OnlyNumbers<Integer> integerOnlyNumbers = new OnlyNumbers<>(1);
        OnlyNumbers<Long> longOnlyNumbers = new OnlyNumbers<>(2L);
        //OnlyNumbers<Character> a = new OnlyNumbers<>('A'); - incorrect data
        //OnlyNumbers<String> a1 = new OnlyNumbers<>("A");   - incorrect data

        OnlyNumbers numbers = new OnlyNumbers(1);
        OnlyNumbers numbers1 = new OnlyNumbers(2L);
        OnlyNumbers numbers2 = new OnlyNumbers(3.0);
        //OnlyNumbers numbers3 = new OnlyNumbers("A"); - incorrect data
    }
}
