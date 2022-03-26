package by.eparmon.leetcode.datastructures.linkedlist.problem141;

/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * <p>
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * <p>
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 * <p>
 * <a href="https://leetcode.com/problems/linked-list-cycle/">Leetcode</a>
 */
public class LinkedListCycle {

    public boolean solve(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast.next == null) {
                return false;
            }
            fast = fast.next;
            if (fast.next == slow) {
                return true;
            }
        }
        return false;
    }

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }

}
