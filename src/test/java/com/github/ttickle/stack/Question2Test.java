package com.github.ttickle.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2Test {

    private Question2 question2;

    @BeforeEach
    void setUp() {
        question2 = new Question2();
    }

    @Test
    void evalRPN() {
        String[] example1Input = {"2", "1", "+", "3", "*"};
        int example1ExpectedResult = 9;
        assertEquals(example1ExpectedResult, question2.evalRPN(example1Input));


        String[] example2Input = {"4", "13", "5", "/", "+"};
        int example2ExpectedResult = 6;
        assertEquals(example2ExpectedResult, question2.evalRPN(example2Input));

        String[] example3Input = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int example3ExpectedResult = 22;
        assertEquals(example3ExpectedResult, question2.evalRPN(example3Input));
    }
}