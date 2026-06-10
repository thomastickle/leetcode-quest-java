package com.github.ttickle.monotonicstack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MonotonicStackQuestion2 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] daysToNext = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i  = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int previousIndex = stack.pop();
                daysToNext[previousIndex] = i - previousIndex;
            }

            stack.push(i);
        }

        return daysToNext;
    }
}
