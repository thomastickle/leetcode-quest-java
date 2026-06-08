package com.github.ttickle.array1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question3Test {
    private Question3 question3;

    @BeforeEach
    void setUp() {
        this.question3 = new Question3();
    }

    @Test
    void findMaxConsecutiveOnes() {
        int[] example1Input = {1,1,0,1,1,1};
        int expectedExample1Output = 3;
        assertEquals(expectedExample1Output, question3.findMaxConsecutiveOnes(example1Input));


        int[] example2Input = {1,0,1,1,0,1};
        int expectedExample2Output = 2;
        assertEquals(expectedExample2Output, question3.findMaxConsecutiveOnes(example2Input));
    }

}