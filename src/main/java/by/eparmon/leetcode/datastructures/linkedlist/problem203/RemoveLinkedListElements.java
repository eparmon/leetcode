package by.eparmon.leetcode.datastructures.linkedlist.problem203;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;

public class RemoveLinkedListElements {

    public ListNode solve(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        while (head.val == val) {
            head = head.next;
            if (head == null) {
                return null;
            }
        }
        var node = head;
        while (node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }

}
