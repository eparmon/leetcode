package by.eparmon.leetcode.datastructures.linkedlist.problem206;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * <p>
 * <a href="https://leetcode.com/problems/reverse-linked-list/">Leetcode</a>
 */
public class ReverseLinkedList {

    public ListNode solve(ListNode head) {
        if (head == null) {
            return null;
        }
        var node = head.next;
        head.next = null;
        while (node != null) {
            var nextNode = node.next;
            node.next = head;
            head = node;
            node = nextNode;
        }
        return head;
    }


    public ListNode solveRecursively(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        var tail = head.next;
        head.next = null;
        return solveRecursively(head, tail);
    }

    private ListNode solveRecursively(ListNode head, ListNode tail) {
        if (tail == null) {
            return head;
        }
        var newTail = tail.next;
        tail.next = head;
        return solveRecursively(tail, newTail);
    }

}
