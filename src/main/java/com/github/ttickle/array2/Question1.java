package com.github.ttickle.array2;

public class Question1 {

    /**
     * Finds and returns the duplicated number and missing number.
     *
     * We could probably make this 1n instead of 2 by using difference of squares, but do I need to be that clever in an
     * interview?
     * @param nums Input containing a missing number in the range of 1..n and a duplicated
     * @return int array in the from of {duplicate number, missing number}
     */
    public int[] findErrorNums(int[] nums) {
        int[] counts = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            counts[nums[i] - 1] += 1;
        }

        int missing = Integer.MIN_VALUE;
        int duplicate = Integer.MIN_VALUE;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 0) {
                missing = i + 1;
            }

            if (counts[i] > 1) {
                duplicate = i + 1;
            }
        }
        return new int[]{duplicate, missing};
    }
}
