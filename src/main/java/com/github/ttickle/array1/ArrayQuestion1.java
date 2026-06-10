package com.github.ttickle.array1;

import com.github.ttickle.Solution;

public class ArrayQuestion1 implements Solution {

    /**
     * Concat the array with itself.  This approach uses the System.arraycopy, but it could
     * be done with standard for loops or use streams.
     *
     * @param nums The array of ints to concat
     * @return a new array with both results.
     */
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[2 * nums.length];
        System.arraycopy(nums, 0, result, 0, nums.length);
        System.arraycopy(nums, 0, result, nums.length, nums.length);
        return result;
    }
}
