package com.github.ttickle.hash;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashQuestion3Test {

    private HashQuestion3 question3;

    @BeforeEach
    void setUp() {
        this.question3 = new HashQuestion3();
    }

    @Test
    void firstMissingPositive() {
        int[] example1Input = new  int[] {1, 2, 0};
        int example1ExpectedOutput = 3;
        assertEquals(example1ExpectedOutput, question3.firstMissingPositive(example1Input));

        int[] example2Input = new  int[] {3,4,-1,1};
        int example2ExpectedOutput = 2;
        assertEquals(example2ExpectedOutput, question3.firstMissingPositive(example2Input));

        int[] example3Input = new  int[] {7,8,9,11,12};
        int example3ExpectedOutput = 1;
        assertEquals(example3ExpectedOutput, question3.firstMissingPositive(example3Input));
    }
}