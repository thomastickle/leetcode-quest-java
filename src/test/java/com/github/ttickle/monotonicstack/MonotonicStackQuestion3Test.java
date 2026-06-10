package com.github.ttickle.monotonicstack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonotonicStackQuestion3Test {

    private MonotonicStackQuestion3 question3;

    @BeforeEach
    void setUp() {
        this.question3 = new MonotonicStackQuestion3();
    }

    @Test
    void largestRectangleArea() {
        int[] example1Input = {2,1,5,6,2,3};
        int example1ExpectedOutput = 10;
        assertEquals(example1ExpectedOutput, question3.largestRectangleArea(example1Input));

        int[] example2Input = {2,4};
        int example2ExpectedOutput = 4;
        assertEquals(example2ExpectedOutput, question3.largestRectangleArea(example2Input));
    }
}