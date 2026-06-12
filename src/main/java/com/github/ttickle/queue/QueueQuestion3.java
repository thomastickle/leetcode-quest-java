package com.github.ttickle.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class QueueQuestion3 {

    public Object[] processQueue(String[] input, int[] values) {
        Object[] output =  new Object[input.length];
        MyQueue queue = new MyQueue();
        for (int i = 0; i < input.length; i++) {
            switch (input[i]) {
                case "MyQueue" -> {
                    queue = new MyQueue();
                    output[i] = null;
                }
                case "push" -> {
                    queue.push(values[i]);
                    output[i] = null;
                }
                case "pop" -> {
                    output[i] = queue.pop();
                }
                case "peek" -> {
                    output[i] = queue.peek();
                }
                case "empty" -> {
                    output[i] = queue.empty();
                }
            }
        }
        return output;
    }
}


class MyQueue {
    private final Deque<Integer> in;
    private final Deque<Integer> out;

    public MyQueue() {
        this.in = new ArrayDeque<>();
        this.out = new ArrayDeque<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if (out.isEmpty()) {
            rotateInToOut();
        }
        return out.pop();
    }

    public int peek() {
        if (out.isEmpty()) {
            rotateInToOut();
        }
        return out.peek();
    }

    private void rotateInToOut() {
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
    }

    public boolean empty() {
        return out.isEmpty() && in.isEmpty();
    }
}

