package com.github.ttickle.hash;

import java.util.HashMap;
import java.util.Map;

public class HashQuestion1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complimentMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            if (complimentMap.containsKey(needed)) {
                return new int[]{complimentMap.get(needed), i};
            }

            complimentMap.put(nums[i], i);
        }
        return new int[0];
    }
}
