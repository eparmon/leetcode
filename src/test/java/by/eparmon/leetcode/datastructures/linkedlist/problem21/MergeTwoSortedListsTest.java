package by.eparmon.leetcode.datastructures.linkedlist.problem21;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists solution = new MergeTwoSortedLists();

    @Test
    public void test1() {
        var headA = new ListNode(1);
        var nodeA2 = new ListNode(2);
        var nodeA3 = new ListNode(4);
        var headB = new ListNode(1);
        var nodeB2 = new ListNode(3);
        var nodeB3 = new ListNode(4);
        headA.next = nodeA2;
        nodeA2.next = nodeA3;
        headB.next = nodeB2;
        nodeB2.next = nodeB3;
        doTest(solution.solve(headA, headB), List.of(1, 1, 2, 3, 4, 4));
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
