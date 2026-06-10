package com.github.ttickle.array1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayQuestion2Test {

    private ArrayQuestion2 arrayQuestion2;

    @BeforeEach
    void setUp() {
        arrayQuestion2 = new ArrayQuestion2();
    }

    @Test
    void shuffle() {
        int[] example1Input = {2,5,1,3,4,7};
        int example1Midpoint = 3;
        int[] expectedExample1Output = {2,3,5,4,1,7};
        assertArrayEquals(expectedExample1Output, arrayQuestion2.shuffle(example1Input, example1Midpoint));

        int[] example2Input = {1,2,3,4,4,3,2,1};
        int example2Midpoint = 4;
        int[] expectedExample2Output = {1,4,2,3,3,2,4,1};
        assertArrayEquals(expectedExample2Output, arrayQuestion2.shuffle(example2Input, example2Midpoint));


        int[] example3Input = {1,1,2,2};
        int example3Midpoint = 2;
        int[] expectedExample3Output = {1,2,1,2};
        assertArrayEquals(expectedExample3Output, arrayQuestion2.shuffle(example3Input, example3Midpoint));
    }
}