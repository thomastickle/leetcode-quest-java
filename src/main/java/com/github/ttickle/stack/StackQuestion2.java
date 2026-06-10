package com.github.ttickle.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackQuestion2 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            switch (token) {
                case "*" -> {
                    int second = stack.pop();
                    int first = stack.pop();
                    stack.push(first * second);
                }
                case "+" -> {
                    int second = stack.pop();
                    int first = stack.pop();
                    stack.push(first + second);
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
                default -> stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
