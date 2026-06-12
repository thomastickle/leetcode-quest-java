package com.github.ttickle.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QueueQuestion3Test {

    private QueueQuestion3 question3;

    @BeforeEach
    void setUp() {
        this.question3 = new QueueQuestion3();
    }

    @Test
    void processQueue() {
        String[] example1InputOperation = {"MyQueue", "push", "push", "peek", "pop", "empty"};
        int[] example1InputValues = {0, 1, 2, 0, 0};
        Object[] expectedOutput = {null, null, null, 1, 1, false};
        assertArrayEquals(expectedOutput, question3.processQueue(example1InputOperation, example1InputValues));
    }
}