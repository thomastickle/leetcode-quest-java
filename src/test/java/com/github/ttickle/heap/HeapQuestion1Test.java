package com.github.ttickle.heap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapQuestion1Test {

    private HeapQuestion1 question1;

    @BeforeEach
    void setUp() {
        this.question1 = new HeapQuestion1();
    }

    @Test
    void lastStoneWeight() {
       int[] example1Input = {2,7,4,1,8,1};
       int example1ExpectedOutput = 1;
       assertEquals(example1ExpectedOutput, question1.lastStoneWeight(example1Input));
    }
}