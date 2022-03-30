package by.eparmon.leetcode.datastructures.linkedlist.problem234;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeLinkedListTest {

    private final PalindromeLinkedList solution = new PalindromeLinkedList();

    @Test
    public void test1() {
        var head = new ListNode(1);
        var node2 = new ListNode(2);
        var node3 = new ListNode(2);
        var node4 = new ListNode(1);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        Assertions.assertTrue(solution.solve(head));
    }

    @Test
    public void test2() {
        var head = new ListNode(1);
        head.next = new ListNode(2);
        Assertions.assertFalse(solution.solve(head));
    }

    @Test
    public void test3() {
        Assertions.assertTrue(solution.solve(new ListNode(1)));
    }

}
