package com.github.ttickle.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueQuestion1Test {

    private QueueQuestion1 question1;

    @BeforeEach
    void setUp() {
        this.question1 = new QueueQuestion1();
    }

    @Test
    void countStudents() {
        int[] example1StudentInput = {1,1,0,0};
        int[] example1sandwichInput = {0, 1, 0, 1};
        int example1ExpectedOutput = 0;
        assertEquals(example1ExpectedOutput,  question1.countStudents(example1StudentInput, example1sandwichInput));

        int[] example2StudentInput = {1,1,1,0,0,1};
        int[] example2sandwichInput = {1, 0, 0, 0, 1, 1};
        int example2ExpectedOutput = 3;
        assertEquals(example2ExpectedOutput,  question1.countStudents(example2StudentInput, example2sandwichInput));
    }
}