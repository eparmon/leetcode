package by.eparmon.leetcode.datastructures.linkedlist.problem234;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;

/**
 * Given the head of a singly linked list, return true if it is a palindrome.
 * <p>
 * <a href="https://leetcode.com/problems/palindrome-linked-list/">Leetcode</a>
 */
public class PalindromeLinkedList {

    public boolean solve(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        var fast = head;
        int size = 0;
        while (fast != null) {
            fast = fast.next;
            size++;
        }
        fast = head.next;
        for (int i = 0; i < size / 2 - 1; i++) {
            var nextNode = fast.next;
            fast.next = head;
            head = fast;
            fast = nextNode;
        }
        if (size % 2 == 1) {
            fast = fast.next;
        }
        var slow = head;
        while (fast != null) {
            if (slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

}
