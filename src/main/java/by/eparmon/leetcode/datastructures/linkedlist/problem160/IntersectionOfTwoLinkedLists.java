package by.eparmon.leetcode.datastructures.linkedlist.problem160;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;

/**
 * Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the
 * two linked lists have no intersection at all, return null.
 * <p>
 * The test cases are generated such that there are no cycles anywhere in the entire linked structure.
 * <p>
 * Note that the linked lists must retain their original structure after the function returns.
 * <p>
 * <a href="https://leetcode.com/problems/intersection-of-two-linked-lists/">Leetcode</a>
 */
public class IntersectionOfTwoLinkedLists {

    public ListNode solve(ListNode headA, ListNode headB) {
        int sizeA = getListLength(headA);
        int sizeB = getListLength(headB);
        ListNode pointerA = headA;
        ListNode pointerB = headB;
        if (sizeA > sizeB) {
            pointerA = moveForward(pointerA, sizeA - sizeB);
        } else if (sizeA < sizeB) {
            pointerB = moveForward(pointerB, sizeB - sizeA);
        }
        while (pointerA != pointerB) {
            pointerA = pointerA.next;
            pointerB = pointerB.next;
        }
        return pointerA;
    }

    private ListNode moveForward(ListNode node, int n) {
        for (int i = 0; i < n; i++) {
            node = node.next;
        }
        return node;
    }

    private int getListLength(ListNode head) {
        if (head == null) {
            return 0;
        }
        int count = 1;
        while (head.next != null) {
            head = head.next;
            count++;
        }
        return count;
    }

}
