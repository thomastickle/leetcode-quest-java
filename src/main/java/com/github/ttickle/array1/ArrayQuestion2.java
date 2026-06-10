package com.github.ttickle.array1;

import com.github.ttickle.Solution;

public class ArrayQuestion2 implements Solution {

    /**
     * A method of shuffling an array starting at the midpoint specified by n.  This method does not do bounds
     * checking or uneven halfs.
     *
     * @param nums array to shuffle
     * @param n    midpoint to use for the other hand
     * @return an array that shuffled the end points.
     */
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];
        }

        return result;
    }
}
