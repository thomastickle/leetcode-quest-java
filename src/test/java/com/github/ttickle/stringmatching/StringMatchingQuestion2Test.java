package com.github.ttickle.stringmatching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMatchingQuestion2Test {

    private StringMatchingQuestion2 question2;

    @BeforeEach
    void setUp() {
        this.question2 = new StringMatchingQuestion2();
    }

    @Test
    void rotateString() {
        String example1Input = "abcde";
        String example1Goal = "cdeab";
        assertTrue(question2.rotateString(example1Input, example1Goal));

        String example2Input = "abcde";
        String example2Goal = "abced";
        assertFalse(question2.rotateString(example2Input, example2Goal));
    }
}