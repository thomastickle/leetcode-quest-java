package com.github.ttickle.linkedlist;

import java.util.List;

public class LinkedListQuestion2 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode currentOdd = head;
        ListNode currentEven = head.next;
        ListNode evenHead = currentEven;

        while (currentEven != null && currentEven.next != null) {
            currentOdd.next = currentEven.next;
            currentOdd = currentOdd.next;

            currentEven.next = currentOdd.next;
            currentEven = currentEven.next;
        }

        currentOdd.next = evenHead;
        return head;
    }
}
