package com.github.ttickle.array2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {

    private Question1 question1;

    @BeforeEach
    void setUp() {
        this.question1 = new Question1();
    }

    @Test
    void findErrorNums() {
        int[] example1Input = {1,2,2,4};
        int[] example1Output = {2,3};
        assertArrayEquals(example1Output, question1.findErrorNums(example1Input));


        int[] example2Input = {1,1};
        int[] example2Output = {1,2};
        assertArrayEquals(example2Output, question1.findErrorNums(example2Input));

        int[] example3Input = {3,2,2};
        int[] example3Output = {2,1};
        assertArrayEquals(example3Output, question1.findErrorNums(example3Input));
    }
}