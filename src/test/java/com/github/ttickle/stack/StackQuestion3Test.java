package com.github.ttickle.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StackQuestion3Test {
    StackQuestion3 stackQuestion3;

    @BeforeEach
    void setUp() {
        stackQuestion3 = new StackQuestion3();
    }

    @Test
    void testExclusiveTime(){
        int example1FunctionsInput = 2;
        List<String> example1LogsInput = List.of("0:start:0", "1:start:2", "1:end:5", "0:end:6");
        int[] expectedExample1Output = {3,4};
        int[] example1Output = stackQuestion3.exclusiveTime(example1FunctionsInput, example1LogsInput);
        assertArrayEquals(expectedExample1Output, example1Output);

        int example2FunctionsInput = 1;
        List<String> example2LogsInput = List.of("0:start:0","0:start:2","0:end:5","0:start:6","0:end:6","0:end:7");
        int[] expectedExample2Output = {8};
        int[] example2Output = stackQuestion3.exclusiveTime(example2FunctionsInput, example2LogsInput);
        assertArrayEquals(expectedExample2Output, example2Output);

        int example3FunctionsInput = 2;
        List<String> example3LogsInput = List.of("0:start:0","0:start:2","0:end:5","1:start:6","1:end:6","0:end:7");
        int[] expectedExample3Output = {7,1};
        int[] example3Output = stackQuestion3.exclusiveTime(example3FunctionsInput, example3LogsInput);
        assertArrayEquals(expectedExample3Output, example3Output);

    }
}