package by.eparmon.leetcode.datastructures.linkedlist.problem2;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbersTest {

    private final AddTwoNumbers solution = new AddTwoNumbers();

    @Test
    public void test1() {
        var headA = new ListNode(2);
        var nodeA2 = new ListNode(4);
        var nodeA3 = new ListNode(3);
        var headB = new ListNode(5);
        var nodeB2 = new ListNode(6);
        var nodeB3 = new ListNode(4);
        headA.next = nodeA2;
        nodeA2.next = nodeA3;
        headB.next = nodeB2;
        nodeB2.next = nodeB3;
        doTest(solution.solve(headA, headB), List.of(7, 0, 8));
    }

    @Test
    public void test2() {
        var headA = new ListNode(9);
        var nodeA2 = new ListNode(9);
        var nodeA3 = new ListNode(9);
        var nodeA4 = new ListNode(9);
        var nodeA5 = new ListNode(9);
        var nodeA6 = new ListNode(9);
        var nodeA7 = new ListNode(9);
        var headB = new ListNode(9);
        var nodeB2 = new ListNode(9);
        var nodeB3 = new ListNode(9);
        var nodeB4 = new ListNode(9);
        headA.next = nodeA2;
        nodeA2.next = nodeA3;
        nodeA3.next = nodeA4;
        nodeA4.next = nodeA5;
        nodeA5.next = nodeA6;
        nodeA6.next = nodeA7;
        headB.next = nodeB2;
        nodeB2.next = nodeB3;
        nodeB3.next = nodeB4;
        doTest(solution.solve(headA, headB), List.of(8, 9, 9, 9, 0, 0, 0, 1));
    }

    @Test
    public void test3() {
        var headA = new ListNode(2);
        var nodeA2 = new ListNode(4);
        var nodeA3 = new ListNode(9);
        var headB = new ListNode(5);
        var nodeB2 = new ListNode(6);
        var nodeB3 = new ListNode(4);
        var nodeB4 = new ListNode(9);
        headA.next = nodeA2;
        nodeA2.next = nodeA3;
        headB.next = nodeB2;
        nodeB2.next = nodeB3;
        nodeB3.next = nodeB4;
        doTest(solution.solve(headA, headB), List.of(7, 0, 4, 0, 1));
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
