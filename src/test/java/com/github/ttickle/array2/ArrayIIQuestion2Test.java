package com.github.ttickle.array2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIIQuestion2Test {

    private ArrayIIQuestion2 arrayIIQuestion2;

    @BeforeEach
    void setUp() {
        this.arrayIIQuestion2 = new ArrayIIQuestion2();
    }

    @Test
    void smallerNumbersThanCurrent() {
        int[] example1Input = {8,1,2,2,3};
        int[] expectedExample1Output = {4,0,1,1,3};
        assertArrayEquals(expectedExample1Output, arrayIIQuestion2.smallerNumbersThanCurrent(example1Input));

        int[] example2Input = {6,5,4,8};
        int[] expectedExample2Output = {2,1,0,3};
        assertArrayEquals(expectedExample2Output, arrayIIQuestion2.smallerNumbersThanCurrent(example2Input));

        int[] example3Input = {7,7,7,7};
        int[] expectedExample3Output = {0,0,0,0};
        assertArrayEquals(expectedExample3Output, arrayIIQuestion2.smallerNumbersThanCurrent(example3Input));
    }
}