package com.github.ttickle.heap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeapQuestion2Test {

    private HeapQuestion2 question2;

    @BeforeEach
    void setUp() {
        this.question2 = new HeapQuestion2();
    }

    @Test
    void kSmallestPairs() {
        int[] example1Input1 = {1, 7, 11};
        int[] example1Input2 = {2, 4, 6};
        int example1InputK = 3;
        List<List<Integer>> example1ExpectedInput = List.of(List.of(1, 2), List.of(1, 4), List.of(1, 6));
        assertEquals(example1ExpectedInput, question2.kSmallestPairs(example1Input1, example1Input2, example1InputK));

        int[] example2Input1 = {1, 1, 2};
        int[] example2Input2 = {1, 2, 3};
        int example2InputK = 2;
        List<List<Integer>> example2ExpectedInput = List.of(List.of(1, 1), List.of(1, 1));
        assertEquals(example2ExpectedInput, question2.kSmallestPairs(example2Input1, example2Input2, example2InputK));
    }
}