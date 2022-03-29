package by.eparmon.leetcode.datastructures.linkedlist.problem206;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedListTest {

    private ReverseLinkedList solution = new ReverseLinkedList();

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
        doTest(solution.solve(head), List.of(5, 4, 3, 2, 1));
    }

    @Test
    public void test2() {
        var head = new ListNode(1);
        head.next = new ListNode(2);
        doTest(solution.solve(head), List.of(2, 1));
    }

    @Test
    public void test3() {
        doTest(solution.solve(null), List.of());
    }


    @Test
    public void testRecursively1() {
        var head = new ListNode(1);
        var node2 = new ListNode(2);
        var node3 = new ListNode(3);
        var node4 = new ListNode(4);
        var node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        doTest(solution.solveRecursively(head), List.of(5, 4, 3, 2, 1));
    }

    @Test
    public void testRecursively2() {
        var head = new ListNode(1);
        head.next = new ListNode(2);
        doTest(solution.solveRecursively(head), List.of(2, 1));
    }

    @Test
    public void testRecursively3() {
        doTest(solution.solveRecursively(null), List.of());
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
