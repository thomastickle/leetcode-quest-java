package com.github.ttickle.array2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class Question3Test {

    private Question3 question3;

    @BeforeEach
    void setUp() {
        this.question3 = new Question3();
    }

    @Test
    void findDisappearedNumbers() {
        int[] example1Input = {4,3,2,7,8,2,3,1};
        var example1ExpectedOutput = List.of(5,6);
        assertEquals(example1ExpectedOutput, question3.findDisappearedNumbers(example1Input));

        int[] example2Input = {1,1};
        var example2ExpectedOutput = List.of(2);
        assertEquals(example2ExpectedOutput, question3.findDisappearedNumbers(example2Input));
    }
}