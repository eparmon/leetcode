package by.eparmon.leetcode.datastructures.linkedlist.problem61;

import by.eparmon.leetcode.datastructures.linkedlist.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class RotateListTest {

    private final RotateList solution = new RotateList();

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
        doTest(solution.solve(head, 2), List.of(4, 5, 1, 2, 3));
    }

    @Test
    public void test2() {
        var head = new ListNode(0);
        var node2 = new ListNode(1);
        var node3 = new ListNode(2);
        head.next = node2;
        node2.next = node3;
        doTest(solution.solve(head, 4), List.of(2, 0, 1));
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
