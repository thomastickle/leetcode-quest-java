package com.github.ttickle.hash;

import java.util.HashMap;
import java.util.Map;

public class HashQuestion2 {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        // Create a set of copies.
        Map<Node, Node> copies = new HashMap<>();
        Node current = head;
        while (current != null) {
            copies.put(current, new Node(current.val));
            current = current.next;
        }

        // Now run through the original list.
        // Get the copy of it.  Set its next and random pointers, by looking up the node they point too.
        current = head;
        while (current != null) {
            Node copy = copies.get(current);
            copy.next = copies.get(current.next);
            copy.random = copies.get(current.random);

            current = current.next;
        }
        return copies.get(head);
    }
}
