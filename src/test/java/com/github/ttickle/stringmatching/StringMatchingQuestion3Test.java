package com.github.ttickle.stringmatching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMatchingQuestion3Test {

    private StringMatchingQuestion3 question3;

    @BeforeEach
    public void setup() {
        this.question3 = new StringMatchingQuestion3();
    }

    @Test
    void repeatedStringMatch() {
        String example1InputA = "abcd";
        String example1InputSubstring = "cdabcdab";
        int example1ExpectedOutput = 3;
        assertEquals(example1ExpectedOutput, question3.repeatedStringMatch(example1InputA, example1InputSubstring));

        String example2InputA = "a";
        String example2InputSubstring = "aa";
        int example2ExpectedOutput = 2;
        assertEquals(example2ExpectedOutput, question3.repeatedStringMatch(example2InputA, example2InputSubstring));
    }
}