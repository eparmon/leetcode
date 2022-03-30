package by.eparmon.leetcode.datastructures.linkedlist.problem203;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class RemoveLinkedListElementsTest {

    private final RemoveLinkedListElements solution = new RemoveLinkedListElements();

    @Test
    public void test1() {
        var head = new ListNode(1);
        var node2 = new ListNode(2);
        var node3 = new ListNode(6);
        var node4 = new ListNode(3);
        var node5 = new ListNode(4);
        var node6 = new ListNode(5);
        var node7 = new ListNode(6);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        doTest(solution.solve(head, 6), List.of(1, 2, 3, 4, 5));
    }

    @Test
    public void test2() {
        doTest(solution.solve(null, 1), List.of());
    }

    @Test
    public void test3() {
        var head = new ListNode(7);
        var node2 = new ListNode(7);
        var node3 = new ListNode(7);
        var node4 = new ListNode(7);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        doTest(solution.solve(head, 7), List.of());
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
