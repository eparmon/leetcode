package by.eparmon.leetcode.datastructures.linkedlist.problem160;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionOfTwoLinkedListsTest {

    private final IntersectionOfTwoLinkedLists solution = new IntersectionOfTwoLinkedLists();

    @Test
    public void test1() {
        var headA = new ListNode(4);
        var nodeA2 = new ListNode(1);
        var headB = new ListNode(5);
        var nodeB2 = new ListNode(6);
        var nodeB3 = new ListNode(1);
        var nodeC1 = new ListNode(8);
        var nodeC2 = new ListNode(4);
        var nodeC3 = new ListNode(5);
        headA.next = nodeA2;
        nodeA2.next = nodeC1;
        headB.next = nodeB2;
        nodeB2.next = nodeB3;
        nodeB3.next = nodeC1;
        nodeC1.next = nodeC2;
        nodeC2.next = nodeC3;
        Assertions.assertEquals(nodeC1, solution.solve(headA, headB));
    }

    @Test
    public void test2() {
        var headA = new ListNode(1);
        var nodeA2 = new ListNode(9);
        var nodeA3 = new ListNode(1);
        var headB = new ListNode(3);
        var nodeC1 = new ListNode(2);
        var nodeC2 = new ListNode(4);
        headA.next = nodeA2;
        nodeA2.next = nodeA3;
        nodeA3.next = nodeC1;
        headB.next = nodeC1;
        nodeC1.next = nodeC2;
        Assertions.assertEquals(nodeC1, solution.solve(headA, headB));
    }

    @Test
    public void test3() {
        var headA = new ListNode(2);
        var nodeA2 = new ListNode(6);
        var nodeA3 = new ListNode(4);
        var headB = new ListNode(1);
        var nodeB2 = new ListNode(5);
        headA.next = nodeA2;
        nodeA2.next = nodeA3;
        headB.next = nodeB2;
        Assertions.assertNull(solution.solve(headA, headB));
    }

}
