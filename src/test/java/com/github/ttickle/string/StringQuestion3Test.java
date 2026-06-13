package com.github.ttickle.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringQuestion3Test {

    private StringQuestion3 question3;

    @BeforeEach
    void setUp() {
        this.question3 = new StringQuestion3();
    }

    @Test
    void maskPII() {
        String example1Input = "LeetCode@LeetCode.com";
        String example1ExpectedOutput = "l*****e@leetcode.com";
        assertEquals(example1ExpectedOutput, question3.maskPII(example1Input));

        String example2Input = "AB@qq.com";
        String example2ExpectedOutput = "a*****b@qq.com";
        assertEquals(example2ExpectedOutput, question3.maskPII(example2Input));

        String example3Input = "1(234)567-890";
        String example3ExpectedOutput = "***-***-7890";
        assertEquals(example3ExpectedOutput, question3.maskPII(example3Input));

        String example4Input = "1(234)567-8909";
        String example4ExpectedOutput = "+*-***-***-8909";
        assertEquals(example4ExpectedOutput, question3.maskPII(example4Input));
    }
}