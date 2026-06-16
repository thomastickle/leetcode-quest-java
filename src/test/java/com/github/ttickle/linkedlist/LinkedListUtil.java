package com.github.ttickle.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LinkedListUtil {

    public static ListNode createList(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }

    public static void assertListEquals(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }

        assertNull(expected);
        assertNull(actual);
    }
}
