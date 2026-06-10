package com.github.ttickle.stack;

import java.util.Stack;

public class Question2 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "*" -> {
                    stack.push(stack.pop() * stack.pop());
                }
                case "+" -> {
                    stack.push(stack.pop() + stack.pop());
                }
                case "/" -> {
                    int second = stack.pop();
                    int first = stack.pop();
                    stack.push(first / second);
                }
                case "-" -> {
                    int second = stack.pop();
                    int first = stack.pop();
                    stack.push(first - second);
                }
                default -> stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
