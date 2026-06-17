package com.github.ttickle.hash;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HashQuestion2Test {

    private HashQuestion2 question2;

    @BeforeEach
    void setUp() {
        this.question2 = new HashQuestion2();
    }

    @Test
    void copyRandomList() {
        int[][] example1 = {
                {7, -1},
                {13, 0},
                {11, 4},
                {10, 2},
                {1, 0}
        };
        Node example1Head = buildList(example1);
        assertDeepCopy(example1Head, question2.copyRandomList(example1Head));

        int[][] example2 = {
                {1, 1},
                {2, 1}
        };
        Node example2Head = buildList(example2);
        assertDeepCopy(example2Head, question2.copyRandomList(example2Head));

        int[][] example3 = {
                {3, -1},
                {3, 0},
                {3, -1}
        };
        Node example3Head = buildList(example3);
        assertDeepCopy(example3Head, question2.copyRandomList(example3Head));
    }

    static Node buildList(int[][] input) {
        if (input.length == 0) return null;

        Node[] nodes = new Node[input.length];

        // Create all nodes first
        for (int i = 0; i < input.length; i++) {
            nodes[i] = new Node(input[i][0]);
        }

        // Wire next and random pointers
        for (int i = 0; i < input.length; i++) {
            if (i + 1 < input.length) {
                nodes[i].next = nodes[i + 1];
            }

            int randomIndex = input[i][1];
            if (randomIndex != -1) {
                nodes[i].random = nodes[randomIndex];
            }
        }

        return nodes[0];
    }

    static void assertDeepCopy(Node original, Node copy) {

        Map<Node, Integer> originalIndex = new HashMap<>();
        Map<Node, Integer> copyIndex = new HashMap<>();

        Node curr = original;
        int index = 0;

        while (curr != null) {
            originalIndex.put(curr, index++);
            curr = curr.next;
        }

        curr = copy;
        index = 0;

        while (curr != null) {
            copyIndex.put(curr, index++);
            curr = curr.next;
        }

        assertEquals(
                originalIndex.size(),
                copyIndex.size(),
                "List lengths differ"
        );

        Node o = original;
        Node c = copy;

        int position = 0;

        while (o != null && c != null) {

            assertNotSame(
                    o,
                    c,
                    "Node at position " + position + " was not copied"
            );

            assertEquals(
                    o.val,
                    c.val,
                    "Value mismatch at position " + position
            );

            Integer oRandom =
                    o.random == null ? null : originalIndex.get(o.random);

            Integer cRandom =
                    c.random == null ? null : copyIndex.get(c.random);

            assertEquals(
                    oRandom,
                    cRandom,
                    "Random pointer mismatch at position " + position
            );

            o = o.next;
            c = c.next;
            position++;
        }

        assertNull(o);
        assertNull(c);
    }
}