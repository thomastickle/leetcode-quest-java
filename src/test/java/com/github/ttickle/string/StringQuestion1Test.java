package com.github.ttickle.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringQuestion1Test {

    private StringQuestion1 question1;

    @BeforeEach
    void setUp() {
        this.question1 = new StringQuestion1();
    }

    @Test
    void detectCapitalUse() {
        String example1Input = "USA";
        assertTrue(question1.detectCapitalUse(example1Input));

        String example2Input = "FlaG";
        assertFalse(question1.detectCapitalUse(example2Input));

        String example3Input = "leetcode";
        assertTrue(question1.detectCapitalUse(example3Input));

        String example4Input = "ffffffffffffffffffffF";
        assertFalse(question1.detectCapitalUse(example4Input));

    }
}