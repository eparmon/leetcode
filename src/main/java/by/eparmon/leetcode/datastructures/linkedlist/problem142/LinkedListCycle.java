package by.eparmon.leetcode.datastructures.linkedlist.problem142;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;

/**
 * Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * <p>
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
 * following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is
 * connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
 * <p>
 * Do not modify the linked list.
 * <p>
 * <a href="https://leetcode.com/problems/linked-list-cycle-ii/">Leetcode</a>
 */
public class LinkedListCycle {

    public ListNode solve(ListNode head) {
        int maxLoopStartIndex = 0;
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode maxLoopStart = null;
        while (fast.next != null) {
            maxLoopStartIndex++;
            slow = slow.next;
            fast = fast.next;
            if (fast.next == null) {
                return null;
            }
            fast = fast.next;
            if (fast.next == slow) {
                maxLoopStart = slow;
                break;
            }
        }
        if (maxLoopStart == null) {
            return null;
        }
        int loopSize = getLoopSize(maxLoopStart);
        int minLoopStartIndex = Math.max(maxLoopStartIndex - loopSize, 0);
        ListNode minLoopStart = moveForward(head, minLoopStartIndex);
        while (minLoopStartIndex < maxLoopStartIndex) {
            int m = (minLoopStartIndex + maxLoopStartIndex) / 2;
            ListNode node = moveForward(minLoopStart, m - minLoopStartIndex);
            if (isInCycle(node, maxLoopStart, loopSize)) {
                maxLoopStartIndex = m;
                maxLoopStart = node;
            } else {
                minLoopStartIndex = m + 1;
                minLoopStart = node.next;
            }
        }
        return minLoopStart;
    }

    private int getLoopSize(ListNode node) {
        ListNode iterator = node;
        int loopCount = 0;
        do {
            loopCount++;
            iterator = iterator.next;
        }
        while (node != iterator);
        return loopCount;
    }

    private ListNode moveForward(ListNode node, int n) {
        for (int i = 0; i < n; i++) {
            node = node.next;
        }
        return node;
    }

    private boolean isInCycle(ListNode node, ListNode maxLoopStart, int loopCount) {
        ListNode loopNode = maxLoopStart;
        for (int i = 0; i < loopCount; i++) {
            loopNode = loopNode.next;
            if (node == loopNode) {
                return true;
            }
        }
        return false;
    }

}
