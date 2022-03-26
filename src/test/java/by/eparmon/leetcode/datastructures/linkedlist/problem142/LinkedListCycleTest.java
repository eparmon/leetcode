package by.eparmon.leetcode.datastructures.linkedlist.problem142;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListCycleTest {

    private final LinkedListCycle solution = new LinkedListCycle();

    @Test
    public void test1() {
        var head = new LinkedListCycle.ListNode(3);
        var node2 = new LinkedListCycle.ListNode(2);
        var node3 = new LinkedListCycle.ListNode(0);
        var node4 = new LinkedListCycle.ListNode(-4);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        Assertions.assertEquals(node2, solution.solve(head));
    }

    @Test
    public void test2() {
        var head = new LinkedListCycle.ListNode(1);
        var node2 = new LinkedListCycle.ListNode(2);
        head.next = node2;
        node2.next = head;
        Assertions.assertEquals(head, solution.solve(head));
    }

    @Test
    public void test3() {
        var head = new LinkedListCycle.ListNode(1);
        Assertions.assertNull(solution.solve(head));
    }

    @Test
    public void test4() {
        var head = new LinkedListCycle.ListNode(1);
        var node2 = new LinkedListCycle.ListNode(-7);
        var node3 = new LinkedListCycle.ListNode(7);
        var node4 = new LinkedListCycle.ListNode(-4);
        var node5 = new LinkedListCycle.ListNode(19);
        var node6 = new LinkedListCycle.ListNode(6);
        var node7 = new LinkedListCycle.ListNode(-9);
        var node8 = new LinkedListCycle.ListNode(-5);
        var node9 = new LinkedListCycle.ListNode(-2);
        var node10 = new LinkedListCycle.ListNode(-5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node7;
        Assertions.assertEquals(node7, solution.solve(head));
    }

}
