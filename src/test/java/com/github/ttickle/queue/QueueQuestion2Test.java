package com.github.ttickle.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueQuestion2Test {

    private QueueQuestion2 question2;

    @BeforeEach
    void setUp() {
        this.question2 = new QueueQuestion2();
    }

    @Test
    void timeRequiredToBuy() {
        int[] example1Input = {2,3,2};
        int example1KInput = 2;
        int example1ExpectedOutput = 6;
        assertEquals(example1ExpectedOutput, question2.timeRequiredToBuy(example1Input, example1KInput));

        int[] example2Input = {5,1,1,1};
        int example2KInput = 0;
        int example2ExpectedOutput = 8;
        assertEquals(example2ExpectedOutput, question2.timeRequiredToBuy(example2Input, example2KInput));
    }
}