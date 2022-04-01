package by.eparmon.leetcode.datastructures.linkedlist.problem138;

/**
 * A linked list of length n is given such that each node contains an additional random pointer, which could point to
 * any node in the list, or null.
 * <p>
 * Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has
 * its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes
 * should point to new nodes in the copied list such that the pointers in the original list and copied list represent
 * the same list state. None of the pointers in the new list should point to nodes in the original list.
 * <p>
 * For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding
 * two nodes x and y in the copied list, x.random --> y.
 * <p>
 * Return the head of the copied linked list.
 * <p>
 * Your code will only be given the head of the original linked list.
 * <p>
 * <a href="https://leetcode.com/problems/copy-list-with-random-pointer/">Leetcode</a>
 */
public class CopyListWithRandomPointer {

    public Node solve(Node head) {
        if (head == null) {
            return null;
        }
        Node node = head;
        while (node != null) {
            var next = node.next;
            node.next = new Node(node.val);
            node.next.next = next;
            node = next;
        }
        node = head;
        while (node != null) {
            if (node.random != null) {
                node.next.random = node.random.next;
            }
            node = node.next.next;
        }
        var newHead = head.next;
        node = head;
        while (node != null) {
            var nextOriginal = node.next.next;
            if (nextOriginal != null) {
                node.next.next = nextOriginal.next;
            }
            node.next = nextOriginal;
            node = node.next;
        }
        return newHead;
    }

    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

}
