package by.eparmon.leetcode.datastructures.linkedlist.problem430;

/**
 * You are given a doubly linked list, which contains nodes that have a next pointer, a previous pointer, and an
 * additional child pointer. This child pointer may or may not point to a separate doubly linked list, also containing
 * these special nodes. These child lists may have one or more children of their own, and so on, to produce a multilevel
 * data structure as shown in the example below (see link).
 * <p>
 * Given the head of the first level of the list, flatten the list so that all the nodes appear in a single-level,
 * doubly linked list. Let curr be a node with a child list. The nodes in the child list should appear after curr and
 * before curr.next in the flattened list.
 * <p>
 * Return the head of the flattened list. The nodes in the list must have all of their child pointers set to null.
 * <p>
 * <a href="https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/">Leetcode</a>
 */
public class FlattenMultilevelDoublyLinkedList {

    public Node solve(Node head) {
        var node = head;
        while (node != null) {
            if (node.child != null) {
                flatten(node);
            }
            node = node.next;
        }
        return head;
    }

    private void flatten(Node nodeWithChild) {
        var node = nodeWithChild.child;
        while (node.next != null) {
            if (node.child != null) {
                flatten(node);
            }
            node = node.next;
        }
        setNext(node, nodeWithChild.next);
        setNext(nodeWithChild, nodeWithChild.child);
        nodeWithChild.child = null;
    }

    private void setNext(Node prev, Node next) {
        if (next != null) {
            next.prev = prev;
        }
        prev.next = next;
    }

    public static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int val) {
            this.val = val;
        }
    }

}
