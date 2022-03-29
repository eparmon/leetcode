package by.eparmon.leetcode.datastructures.linkedlist.problem141;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListCycleTest {

    private final LinkedListCycle solution = new LinkedListCycle();

    @Test
    public void test1() {
        var head = new ListNode(3);
        var node2 = new ListNode(2);
        var node3 = new ListNode(0);
        var node4 = new ListNode(-4);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        Assertions.assertTrue(solution.solve(head));
    }

    @Test
    public void test2() {
        var head = new ListNode(1);
        var node2 = new ListNode(2);
        head.next = node2;
        node2.next = head;
        Assertions.assertTrue(solution.solve(head));
    }

    @Test
    public void test3() {
        var head = new ListNode(1);
        Assertions.assertFalse(solution.solve(head));
    }

    @Test
    public void test4() {
        Assertions.assertFalse(solution.solve(null));
    }
}
