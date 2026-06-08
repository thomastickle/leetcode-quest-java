package com.github.ttickle.array2;

import com.github.ttickle.Solution;

public class Question2 implements Solution {

    /**
     * Find the count of numbers smaller than the current number.  This is an n^2 solution, and is non optimal.
     * @param nums
     * @return array where each value represents the number of other elements in the array smaller than it.
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (num < nums[i]) {
                    count += 1;
                }
            }
            output[i] = count;
        }
        return output;
    }
}
