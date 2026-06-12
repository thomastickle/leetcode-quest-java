package com.github.ttickle.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapQuestion3 {

    /**
     * This is a solution to heap question 3.  Instead of trying to go upward from the initial array
     * of all 1s, it starts with the target and tries to work backwards.  We keep polling the largest and
     * modulo to get the previous value at the largest.  Generally we try to work where the head of the heap
     * is a 1.  However, we can do some early breakouts. If the remaining sum after subtracting the largest is
     * negative, or equal to or larger than the largest we just subtrated, we know we can never get back to the all 1s.
     *
     * We also can bail out early if previous value has become 0, and the rest now sum to 1.
     *
     * @param target
     * @return
     */
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());

        long sum = 0;
        for (int value : target) {
            heap.offer(value);
            sum += value;
        }

        while (heap.peek() > 1) {
            int largest = heap.poll();
            long rest = sum - largest;

            if (rest <= 0 || rest >= largest) {
                return false;
            }

            long previous = largest % rest;

            if (previous == 0) {
                return rest == 1;
            }

            sum = rest + previous;
            heap.offer((int) previous);
        }

        return true;
    }
}
