package com.github.ttickle.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListQuestion1Test {

    private LinkedListQuestion1 question1;

    @BeforeEach
    void setUp() {
        this.question1 = new LinkedListQuestion1();
    }

    @Test
    void deleteDuplicates() {
        // Example 1: [1,1,2] -> [1,2]
        ListNode input1 = createList(1, 1, 2);
        ListNode result1 = question1.deleteDuplicates(input1);
        assertListEquals(createList(1, 2), result1);

        // Example 2: [1,1,2,3,3] -> [1,2,3]
        ListNode input2 = createList(1, 1, 2, 3, 3);
        ListNode result2 = question1.deleteDuplicates(input2);
        assertListEquals(createList(1, 2, 3), result2);
    }

    private ListNode createList(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }

    private void assertListEquals(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }

        assertNull(expected);
        assertNull(actual);
    }
}