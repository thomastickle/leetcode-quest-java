package com.github.ttickle.linkedlist;

public class LinkedListQuestion3 {

    public ListNode reverseList(ListNode head) {
        return tailRecursiveReverseList(null, head);
    }

    public ListNode tailRecursiveReverseList(ListNode prev, ListNode current) {
        if (current == null) {
            return prev;
        }

        ListNode next = current.next;
        current.next = prev;

        return tailRecursiveReverseList(current, next);
    }

    public ListNode recursiveReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public ListNode iterativeReverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
