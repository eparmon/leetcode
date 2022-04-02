package by.eparmon.leetcode.datastructures.linkedlist.problem61;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;

/**
 * Given the head of a linked list, rotate the list to the right by k places.
 * <p>
 * <a href="https://leetcode.com/problems/rotate-list/">Leetcode</a>
 */
public class RotateList {

    public ListNode solve(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        var fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
            if (fast == null) {
                fast = head;
                k = i + 1 + k % (i + 1);
            }
        }
        var slow = head;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;
    }

}
