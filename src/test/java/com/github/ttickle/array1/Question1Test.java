package com.github.ttickle.array1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Question1Test {

    private Question1 question1;

    @BeforeEach
    public void setUp() {
        question1 = new Question1();
    }

    @Test
    void getConcatenation() {
        int[] example1Input = new int[]{1, 2, 1};
        int[] expectedOutputForExample1 = new int[]{1, 2, 1, 1, 2, 1};
        assertArrayEquals(expectedOutputForExample1, question1.getConcatenation(example1Input));


        int[] example2Input = new int[]{1, 3, 2, 1};
        int[] expectedOutputForExample2 = new int[]{1, 3, 2, 1, 1, 3, 2, 1};
        assertArrayEquals(expectedOutputForExample2, question1.getConcatenation(example2Input));
    }
}