package by.eparmon.leetcode.datastructures.linkedlist.problem328;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class OddEvenLinkedListTest {

    private final OddEvenLinkedList solution = new OddEvenLinkedList();

    @Test
    public void test1() {
        var head = new ListNode(1);
        var node2 = new ListNode(2);
        var node3 = new ListNode(3);
        var node4 = new ListNode(4);
        var node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        doTest(solution.solve(head), List.of(1, 3, 5, 2, 4));
    }

    @Test
    public void test2() {
        var head = new ListNode(2);
        var node2 = new ListNode(1);
        var node3 = new ListNode(3);
        var node4 = new ListNode(5);
        var node5 = new ListNode(6);
        var node6 = new ListNode(4);
        var node7 = new ListNode(7);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        doTest(solution.solve(head), List.of(2, 3, 6, 7, 1, 5, 4));
    }

    private void doTest(ListNode head, List<Integer> expectedList) {
        List<Integer> list = new LinkedList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Assertions.assertEquals(expectedList, list);
    }

}
