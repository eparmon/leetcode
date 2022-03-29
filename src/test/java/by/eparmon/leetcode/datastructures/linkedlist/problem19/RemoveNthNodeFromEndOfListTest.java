package by.eparmon.leetcode.datastructures.linkedlist.problem19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class RemoveNthNodeFromEndOfListTest {

    private final RemoveNthNodeFromEndOfList solution = new RemoveNthNodeFromEndOfList();

    @Test
    public void test1() {
        var head = new RemoveNthNodeFromEndOfList.ListNode(1);
        var node2 = new RemoveNthNodeFromEndOfList.ListNode(2);
        var node3 = new RemoveNthNodeFromEndOfList.ListNode(3);
        var node4 = new RemoveNthNodeFromEndOfList.ListNode(4);
        var node5 = new RemoveNthNodeFromEndOfList.ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        doTest(solution.solve(head, 2), List.of(1, 2, 3, 5));
    }

    @Test
    public void test2() {
        var head = new RemoveNthNodeFromEndOfList.ListNode(1);
        doTest(solution.solve(head, 1), List.of());
    }

    @Test
    public void test3() {
        var head = new RemoveNthNodeFromEndOfList.ListNode(1);
        head.next = new RemoveNthNodeFromEndOfList.ListNode(2);
        doTest(solution.solve(head, 1), List.of(1));
    }

    @Test
    public void test4() {
        var head = new RemoveNthNodeFromEndOfList.ListNode(8);
        var node2 = new RemoveNthNodeFromEndOfList.ListNode(2);
        var node3 = new RemoveNthNodeFromEndOfList.ListNode(8);
        var node4 = new RemoveNthNodeFromEndOfList.ListNode(7);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        doTest(solution.solve(head, 2), List.of(8, 2, 7));
    }

    private void doTest(RemoveNthNodeFromEndOfList.ListNode head, List<Integer> expectedList) {
        List<Integer> list = new LinkedList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Assertions.assertEquals(expectedList, list);
    }

}
