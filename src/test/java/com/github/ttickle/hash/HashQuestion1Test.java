package com.github.ttickle.hash;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HashQuestion1Test {

    private HashQuestion1 question1;

    @BeforeEach
    void setUp() {
        this.question1 = new HashQuestion1();
    }

    @Test
    void twoSum() {
        int[] example1Input = {2,7,11,15};
        int example1Target = 9;
        int[] example1ExpectedOutput = {0, 1};
        assertArrayEquals(example1ExpectedOutput, question1.twoSum(example1Input,example1Target));

        int[] example2Input = {3,2,4};
        int example2Target = 6;
        int[] example2ExpectedOutput = {1, 2};
        assertArrayEquals(example2ExpectedOutput, question1.twoSum(example2Input,example2Target));

        int[] example3Input = {3,3};
        int example3Target = 6;
        int[] example3ExpectedOutput = {0, 1};
        assertArrayEquals(example3ExpectedOutput, question1.twoSum(example3Input,example3Target));  }
}
