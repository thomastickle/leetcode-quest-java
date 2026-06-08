package com.github.ttickle.array2;

import com.github.ttickle.Solution;

public class Question2 implements Solution {

    /**
     * Find the count of numbers smaller than the current number.  This is an n runtime solution as we avoid the inner
     * loop by first creating a count of all the numbers in the array.  Then we run through those counts iteratively
     * using the previous count to define the current value.
     *
     * Finally, we run through our input and look up in the array.
     *
     * @param nums
     * @return array where each value represents the number of other elements in the array smaller than it.
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counts = new int[101];

        for (int n : nums) {
            counts[n]++;
        }

        for (int i = 1; i < counts.length; i++) {
            counts[i] += counts[i - 1];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (num == 0) {
                result[i] = 0;
            } else {
                result[i] = counts[num - 1];
            }
        }
        return result;
    }
}
