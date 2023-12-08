package com.qatelran.org.lessonnine;

import java.util.Stack;

public class TestStack {

    public static void main(String[] args) {
        //LIFO - last input first output
        Stack<String> stack = new Stack<>();

        //push - add element to stack
        //pop - get element from stack and remove element from stack
        //peek - get element from stack , not remove
        //isEmpty - check that stack is not empty
        //search - find element in stack

        //   Alex //
        //  am    //
        //   I    //
        //--------//
        stack.push("I");
        stack.push("am");
        stack.push("Alex");

        System.out.println(stack);
        String elementFromTop = stack.peek();
        System.out.println(elementFromTop);
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        System.out.println();

        String topElement = stack.pop();

        //        //
        //  am    //
        //   I    //
        //--------//
        System.out.println("Top element " + topElement);
        System.out.println(stack);

        System.out.println("New top element " + stack.peek());

        topElement = stack.pop();
        System.out.println("Top element " + topElement);
        System.out.println(stack);

        System.out.println("New top element " + stack.peek());
    }
}
