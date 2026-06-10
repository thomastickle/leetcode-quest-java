package com.github.ttickle.array1;

import com.github.ttickle.Solution;

public class ArrayQuestion3 implements Solution {

    /**
     * Solution to question 3 to find the max nubmer of 1s.
     * @param nums array of 0s and 1s
     * @return max number of consecutive 1s
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentCount = 0;
        int maxCount = 0;
        for (int num : nums) {
            if (num == 1) {
                currentCount++;
            } else {
                maxCount = Math.max(currentCount, maxCount);
                currentCount = 0;
            }
        }
        return Math.max(currentCount, maxCount);
    }
}
