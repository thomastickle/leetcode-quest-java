package com.github.ttickle.heap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapQuestion3Test {

    private HeapQuestion3 question3;

    @BeforeEach
    void setUp() {
        this.question3 = new HeapQuestion3();
    }

    @Test
    void isPossible() {
        int[] example1Input = {9,3,5};
        assertTrue(question3.isPossible(example1Input));

        int[] example2Input = {1,1,1,2};
        assertFalse(question3.isPossible(example2Input));

        int[] example3Input = {8,5};
        assertTrue(question3.isPossible(example3Input));

        int[] example4Input = {1000000000,1000000000,1000000000,1000000000,1000000000,294967297};
        assertFalse(question3.isPossible(example4Input));
    }
}