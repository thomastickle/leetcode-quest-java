package com.github.ttickle.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.github.ttickle.linkedlist.LinkedListUtil.assertListEquals;
import static com.github.ttickle.linkedlist.LinkedListUtil.createList;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListQuestion2Test {

    private LinkedListQuestion2 question2;

    @BeforeEach
    void setUp() {
        this.question2 = new LinkedListQuestion2();
    }

    @Test
    void oddEvenList() {
        ListNode example1List = createList(1,2,3,4,5);
        ListNode example1ExpectedResult = createList(1,3,5,2,4);
        assertListEquals(example1ExpectedResult, question2.oddEvenList(example1List));

        ListNode example2List = createList(2,1,3,5,6,4,7);
        ListNode example2ExpectedResult = createList(2,3,6,7,1,5,4);
        assertListEquals(example2ExpectedResult, question2.oddEvenList(example2List));
    }
}