package com.github.ttickle.monotonicstack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MonotonicStackQuestion3 {
    public int largestRectangleArea(int[] heights) {
        int largestArea = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int rightBoundary = 0; rightBoundary <= heights.length; rightBoundary++) {
            int currentHeight = rightBoundary == heights.length ? 0 :  heights[rightBoundary]; // This is to force the last element to pop.

            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];

                int leftBoundary = stack.isEmpty() ? -1 : stack.peek();

                int width = rightBoundary - leftBoundary - 1;
                int area = height * width;

                largestArea = Math.max(largestArea, area);
            }
            stack.push(rightBoundary);
        }
        return largestArea;
    }
}
