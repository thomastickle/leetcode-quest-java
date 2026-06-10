package com.github.ttickle.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {

    private Question1 question1;

    @BeforeEach
    void setUp() {
        this.question1 = new Question1();
    }

    @Test
    void buildArray() {
        int[] example1InputArray = {1,3};
        int example1ExpectedValue = 3;
        List<String> example1ExpectedValues = List.of("Push", "Push", "Pop", "Push");
        assertEquals(example1ExpectedValues, question1.buildArray(example1InputArray, example1ExpectedValue));

        int[] example2InputArray = {1,2,3};
        int example2ExpectedValue = 3;
        List<String> example2ExpectedValues = List.of("Push", "Push", "Push");
        assertEquals(example2ExpectedValues, question1.buildArray(example2InputArray, example2ExpectedValue));

        int[] example3InputArray = {1,2};
        int example3ExpectedValue = 4;
        List<String> example3ExpectedValues = List.of("Push", "Push");
        assertEquals(example3ExpectedValues, question1.buildArray(example3InputArray, example3ExpectedValue));
    }
}