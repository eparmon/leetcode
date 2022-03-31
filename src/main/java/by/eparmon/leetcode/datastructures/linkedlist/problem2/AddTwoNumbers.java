package by.eparmon.leetcode.datastructures.linkedlist.problem2;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
 * order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * <a href="https://leetcode.com/problems/add-two-numbers/">Leetcode</a>
 */
public class AddTwoNumbers {

    public ListNode solve(ListNode l1, ListNode l2) {
        var head = l1;
        boolean plusOne = false;
        ListNode p1;
        do {
            l1.val += l2.val;
            if (plusOne) {
                l1.val++;
                plusOne = false;
            }
            if (l1.val >= 10) {
                l1.val -= 10;
                plusOne = true;
            }
            p1 = l1;
            l1 = l1.next;
            l2 = l2.next;
        } while (l1 != null && l2 != null);
        if (l1 == null && l2 != null) {
            p1.next = l2;
            l1 = l2;
        }
        while (plusOne && l1 != null) {
            l1.val++;
            if (l1.val < 10) {
                plusOne = false;
            } else {
                l1.val -= 10;
            }
            p1 = l1;
            l1 = l1.next;
        }
        if (plusOne) {
            p1.next = new ListNode(1);
        }
        return head;
    }

}
