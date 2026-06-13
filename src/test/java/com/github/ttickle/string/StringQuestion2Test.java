package com.github.ttickle.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringQuestion2Test {

    private StringQuestion2 question2;

    @BeforeEach
    void setUp() {
        this.question2 = new StringQuestion2();
    }

    @Test
    void licenseKeyFormatting() {
        String example1Input = "5F3Z-2e-9-w";
        int example1k = 4;
        String example1ExpectedOutput = "5F3Z-2E9W";
        assertEquals(example1ExpectedOutput, this.question2.licenseKeyFormatting(example1Input, example1k));

        String example2Input = "2-5g-3-J";
        int example2k = 2;
        String example2ExpectedOutput = "2-5G-3J";
        assertEquals(example2ExpectedOutput, this.question2.licenseKeyFormatting(example2Input, example2k));
    }
}