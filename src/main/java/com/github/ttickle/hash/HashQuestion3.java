package com.github.ttickle.hash;

public class HashQuestion3 {
    public int firstMissingPositive(int[] nums) {
        // Scan through the array, swapping elements to their expected correct position.
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                int correctIndex = nums[i] - 1;
                int tempValueHolder = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = tempValueHolder;
            }
        }

        // Now find the first missing number.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}
