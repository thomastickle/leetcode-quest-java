package com.github.ttickle.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapQuestion1 {

    /**
     * Solves the Last Stone Weight problem using a max heap.
     *
     * <p>The algorithm repeatedly removes the two largest stones, smashes them
     * together, and inserts the remaining weight (if any) back into the heap.
     * A heap is a natural fit because each iteration requires efficient access
     * to the largest remaining stones.</p>
     *
     * <p>Java provides a heap implementation through {@link java.util.PriorityQueue}.
     * However, there are several considerations:</p>
     *
     * <ul>
     *   <li>
     *     {@code PriorityQueue} is a min heap by default. To create a max heap,
     *     a comparator such as {@code Comparator.reverseOrder()} must be supplied.
     *   </li>
     *   <li>
     *     When using a custom comparator, elements must be inserted individually.
     *     This results in an initialization cost of {@code O(n log n)} rather than
     *     the {@code O(n)} heapify operation achievable when building a heap
     *     directly from an array.
     *   </li>
     *   <li>
     *     {@code PriorityQueue} is backed by a dynamically resizing array.
     *     Insertions may occasionally trigger array growth and element copying.
     *   </li>
     * </ul>
     *
     * <p>Although a heap provides an asymptotically better solution
     * ({@code O(n log n)}), a simple array scan can outperform it for very small
     * inputs due to lower constant overhead, improved cache locality, and better
     * branch prediction characteristics. Given this problem's constraint of at
     * most 30 stones, either approach performs well in practice.</p>
     *
     * @param stones the stone weights
     * @return the weight of the final remaining stone, or {@code 0} if no stones remain
     */
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone : stones) {
            heap.offer(stone);
        }

        while (heap.size() > 1) {
            int y = heap.poll();
            int x = heap.poll();

            if (y != x) {
                heap.offer(y - x);
            }
        }
        return heap.isEmpty() ? 0 : heap.peek();
    }
}
