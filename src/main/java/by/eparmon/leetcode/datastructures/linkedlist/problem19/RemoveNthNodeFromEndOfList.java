package by.eparmon.leetcode.datastructures.linkedlist.problem19;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;

import java.util.Objects;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * <p>
 * <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">Leetcode</a>
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode solve(ListNode head, int n) {
        ListNode front = moveForward(head, n);
        if (front == null) {
            head = head.next;
            return head;
        }
        ListNode back = head;
        while (true) {
            ListNode oldFront = front;
            for (int i = 0; i < n; i++) {
                front = front.next;
                if (front == null) {
                    back = moveForward(back, i);
                    break;
                }
            }
            if (front != null) {
                back = oldFront;
            } else {
                removeNextNode(Objects.requireNonNull(back));
                return head;
            }
        }
    }

    private void removeNextNode(ListNode previous) {
        previous.next = previous.next.next;
    }

    private ListNode moveForward(ListNode node, int n) {
        for (int i = 0; i < n; i++) {
            node = node.next;
            if (node == null) {
                return null;
            }
        }
        return node;
    }

}
