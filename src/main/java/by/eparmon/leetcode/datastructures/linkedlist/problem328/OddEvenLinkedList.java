package by.eparmon.leetcode.datastructures.linkedlist.problem328;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;

/**
 * Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even
 * indices, and return the reordered list.
 * <p>
 * The first node is considered odd, and the second node is even, and so on.
 * <p>
 * Note that the relative order inside both the even and odd groups should remain as it was in the input.
 * <p>
 * You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 * <p>
 * <a href="https://leetcode.com/problems/odd-even-linked-list/">Leetcode</a>
 */
public class OddEvenLinkedList {

    public ListNode solve(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode firstEven = head.next;
        ListNode fast = head.next.next;
        while (true) {
            var oldSlowNext = slow.next;
            var oldFastNext = fast.next;
            slow.next = fast;
            oldSlowNext.next = oldFastNext;
            slow = slow.next;
            if (fast.next == null || fast.next.next == null) {
                fast.next = firstEven;
                return head;
            }
            fast = fast.next.next;
        }
    }

}
