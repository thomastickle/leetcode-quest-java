package com.github.ttickle.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Question1 {
    public List<String> buildArray(int[] target, int n) {
        List<String> actions = new ArrayList<>();
        int targetPointer = 0;

        for (int i = 1; i <= n && targetPointer < target.length; i++) {
            actions.add("Push");
            if (target[targetPointer] == i) {
                targetPointer++;
            } else {
                actions.add("Pop");
            }
        }
        return actions;
    }
}
