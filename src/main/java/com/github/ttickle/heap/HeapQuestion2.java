package com.github.ttickle.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class HeapQuestion2 {


    /**
     * Finds the k smallest pairs of 2 arrays of integers.  We use a heap here in the form of {@code PriorityQueue}
     * to store the indexes of the smallest pairs.  While this is slower than some other solutions, it is very safe since
     * we are using a long rather than storing ints.
     * @param nums1 first array of inputs
     * @param nums2 second array of inputs
     * @param k number of pairs to find
     * @return List of pairs of values from the 2 arrays that are the smallest.
     */
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparingLong(a -> (long) nums1[a[0]] + nums2[a[1]]));

        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            heap.offer(new int[]{i, 0});
        }

        List<List<Integer>> result = new ArrayList<>();
        while (k > 0 && !heap.isEmpty()) {
            int[] pair = heap.poll();

            int i = pair[0];
            int j = pair[1];

            result.add(List.of(nums1[i], nums2[j]));

            if (j + 1 < nums2.length) {
                heap.offer(new int[]{i, j + 1});
            }

            k--;
        }

        return result;
    }
}
