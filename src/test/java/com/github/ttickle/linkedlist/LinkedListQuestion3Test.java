package com.github.ttickle.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.github.ttickle.linkedlist.LinkedListUtil.assertListEquals;
import static com.github.ttickle.linkedlist.LinkedListUtil.createList;

class LinkedListQuestion3Test {

    private LinkedListQuestion3 question3;

    @BeforeEach
    void setUp() {
        this.question3 = new LinkedListQuestion3();
    }

    @Test
    void reverseList() {
        ListNode example1Input = createList(1, 2, 3, 4, 5);
        ListNode example1ExpectedResult = createList(5, 4, 3, 2, 1);
        assertListEquals(example1ExpectedResult, question3.reverseList(example1Input));

        ListNode example2Input = createList(1, 2);
        ListNode example2ExpectedResult = createList(2, 1);
        assertListEquals(example2ExpectedResult, question3.reverseList(example2Input));
    }
}