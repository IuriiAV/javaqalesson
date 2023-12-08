package com.qatelran.org.lessonnine;

import java.util.Stack;

public class TestTask {

    public static void main(String[] args) {
        String source = "azzabcddc";   // aab
        // aabcc - > b;

        //Example One
        //Space complexity O(1)
        for(int i = 0; i < source.length(); i++) {
            char c = source.charAt(i);
        }
        //ExampleTwo
        //Space complexity O(N)
        char[] chars = source.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
        }

        // "azzabcddc"
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < source.length(); i++) {
            char c = source.charAt(i);
            if(stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            char temp = stack.peek();
            if(temp == c) {
               stack.pop();
            } else {
                stack.push(c);
            }
        }

        System.out.println(stack);
    }
}
