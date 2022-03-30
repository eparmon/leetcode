package by.eparmon.leetcode.datastructures.linkedlist.problem328;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;

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
