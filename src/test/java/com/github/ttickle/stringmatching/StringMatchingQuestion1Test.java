package com.github.ttickle.stringmatching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMatchingQuestion1Test {

    private StringMatchingQuestion1 question1;

    @BeforeEach
    void setUp() {
        this.question1 = new StringMatchingQuestion1();
    }

    @Test
    void repeatedSubstringPattern() {
        String example1Input = "abab";
        assertTrue(question1.repeatedSubstringPattern(example1Input));

        String example1Input2 = "aba";
        assertFalse(question1.repeatedSubstringPattern(example1Input2));

        String example1Input3 = "abcabcabcabc";
        assertTrue(question1.repeatedSubstringPattern(example1Input3));
    }
}