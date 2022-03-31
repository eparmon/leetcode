package by.eparmon.leetcode.datastructures.linkedlist.problem21;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * <p>
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two
 * lists.
 * <p>
 * Return the head of the merged linked list.
 * <p>
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/">Leetcode</a>
 */
public class MergeTwoSortedLists {

    public ListNode solve(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        var pointer1 = list1;
        var pointer2 = list2;
        ListNode resultHead = new ListNode(0);
        ListNode resultTail = resultHead;
        while (true) {
            if (pointer1.val < pointer2.val) {
                resultTail.next = pointer1;
                pointer1 = pointer1.next;
                if (pointer1 == null) {
                    resultTail.next.next = pointer2;
                    break;
                }
            } else {
                resultTail.next = pointer2;
                pointer2 = pointer2.next;
                if (pointer2 == null) {
                    resultTail.next.next = pointer1;
                    break;
                }
            }
            resultTail = resultTail.next;
        }
        return resultHead.next;
    }

}
