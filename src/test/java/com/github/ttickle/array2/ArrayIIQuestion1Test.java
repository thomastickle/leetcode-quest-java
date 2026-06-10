package com.github.ttickle.array2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIIQuestion1Test {

    private ArrayIIQuestion1 arrayIIQuestion1;

    @BeforeEach
    void setUp() {
        this.arrayIIQuestion1 = new ArrayIIQuestion1();
    }

    @Test
    void findErrorNums() {
        int[] example1Input = {1,2,2,4};
        int[] example1Output = {2,3};
        assertArrayEquals(example1Output, arrayIIQuestion1.findErrorNums(example1Input));


        int[] example2Input = {1,1};
        int[] example2Output = {1,2};
        assertArrayEquals(example2Output, arrayIIQuestion1.findErrorNums(example2Input));

        int[] example3Input = {3,2,2};
        int[] example3Output = {2,1};
        assertArrayEquals(example3Output, arrayIIQuestion1.findErrorNums(example3Input));
    }
}