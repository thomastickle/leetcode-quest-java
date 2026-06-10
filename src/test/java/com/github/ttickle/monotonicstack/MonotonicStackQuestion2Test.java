package com.github.ttickle.monotonicstack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonotonicStackQuestion2Test {

    private MonotonicStackQuestion2 question2;

    @BeforeEach
    void setUp() {
        this.question2 = new MonotonicStackQuestion2();
    }

    @Test
    void dailyTemperatures() {
        int[] example1Input = {73,74,75,71,69,72,76,73};
        int[] example1ExpectedOutput = {1,1,4,2,1,1,0,0};
        assertArrayEquals(example1ExpectedOutput, question2.dailyTemperatures(example1Input));

        int[] example2Input = {30,40,50,60};
        int[] example2ExpectedOutput = {1,1,1,0};
        assertArrayEquals(example2ExpectedOutput, question2.dailyTemperatures(example2Input));

        int[] example3Input = {30,60,90};
        int[] example3ExpectedOutput = {1,1,0};
        assertArrayEquals(example3ExpectedOutput, question2.dailyTemperatures(example3Input));

        int[] example4Input = {89,62,70,58,47,47,46,76,100,70};
        int[] example4ExpectedOutput = {8,1,5,4,3,2,1,1,0,0};
        assertArrayEquals(example4ExpectedOutput, question2.dailyTemperatures(example4Input));
    }
}