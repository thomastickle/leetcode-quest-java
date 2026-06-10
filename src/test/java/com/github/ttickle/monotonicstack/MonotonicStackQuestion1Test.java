package com.github.ttickle.monotonicstack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonotonicStackQuestion1Test {

    private MonotonicStackQuestion1 monotonicStackQuestion1;

    @BeforeEach
    void setUp() {
        this.monotonicStackQuestion1 = new MonotonicStackQuestion1();
    }

    @Test
    void finalPrices() {
        int[] example1Input = {8,4,6,2,3};
        int[] example1ExpectedOutput = {4,2,4,2,3};
        assertArrayEquals(example1ExpectedOutput, this.monotonicStackQuestion1.finalPrices(example1Input));

        int[] example2Input = {1,2,3,4,5};
        int[] example2ExpectedOutput = {1,2,3,4,5};
        assertArrayEquals(example2ExpectedOutput, this.monotonicStackQuestion1.finalPrices(example2Input));


        int[] example3Input = {10,1,1,6};
        int[] example3ExpectedOutput = {9,0,1,6};
        assertArrayEquals(example3ExpectedOutput, this.monotonicStackQuestion1.finalPrices(example3Input));
    }
}