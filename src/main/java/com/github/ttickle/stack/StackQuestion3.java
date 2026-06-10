package com.github.ttickle.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class StackQuestion3 {
    public int[] exclusiveTime(int n, List<String> logs) {
        int previousTime = 0;
        int[] result = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (String log : logs) {
            String[] threadInformation = log.split(":");
            int functionId = Integer.parseInt(threadInformation[0]);
            String operation = threadInformation[1];
            int time = Integer.parseInt(threadInformation[2]);

            switch (operation) {
                case "start" -> {
                    if (!stack.isEmpty()) {
                        int currentFunction = stack.peek();
                        result[currentFunction] += time - previousTime;
                    }

                    stack.push(functionId);
                    previousTime = time;
                }
                case "end" -> {
                    int currentFunctionId = stack.pop();
                    result[currentFunctionId] += time - previousTime + 1;
                    previousTime = time + 1;
                }
            }
        }

        return result;
    }


}
