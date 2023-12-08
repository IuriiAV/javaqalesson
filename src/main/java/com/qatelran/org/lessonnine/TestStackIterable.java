package com.qatelran.org.lessonnine;

import java.util.Stack;

public class TestStackIterable {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("I");
        stack.push("am");
        stack.push("Alex");

        System.out.println(stack.search("I"));
        System.out.println(stack.search("am"));
        System.out.println(stack.search("Alex"));
        System.out.println(stack.search("Hello"));

        //LIFO
        //Alex - am - I
        while (!stack.isEmpty()) {
            String elementFromTop = stack.pop();
            System.out.println(elementFromTop);
        }


    }
}
