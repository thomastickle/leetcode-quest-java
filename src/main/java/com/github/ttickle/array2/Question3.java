package com.github.ttickle.array2;

import com.github.ttickle.Solution;

import java.util.ArrayList;
import java.util.List;

public class Question3 implements Solution {

    /**
     * Solution to Array II Question 3 which makes the value at the index of the value
     * of the original array be set to negative to denote we saw it.
     * @param nums List of numbers minus some numbers.
     * @return List of numbers not seen
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int num : nums) {
            int index = Math.abs(num) - 1;
            nums[index] = nums[index] > 0 ? -nums[index] : nums[index];
        }

        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                results.add(i + 1);
            }
        }

        return results;
    }
}
