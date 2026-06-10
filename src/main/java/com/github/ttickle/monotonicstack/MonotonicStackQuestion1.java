package com.github.ttickle.monotonicstack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MonotonicStackQuestion1 {
    public int[] finalPrices(int[] prices) {
        int[] finalPrice = Arrays.copyOf(prices, prices.length);
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < prices.length; i++) {
            while(!stack.isEmpty() && prices[i] <= prices[stack.peek()]) {
                int previousIndex = stack.pop();
                finalPrice[previousIndex] = prices[previousIndex] - prices[i];
            }
            stack.push(i);
        }

        return finalPrice;
    }
}
