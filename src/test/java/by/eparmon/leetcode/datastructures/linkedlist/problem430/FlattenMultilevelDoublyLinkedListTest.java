package by.eparmon.leetcode.datastructures.linkedlist.problem430;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class FlattenMultilevelDoublyLinkedListTest {

    private final FlattenMultilevelDoublyLinkedList solution = new FlattenMultilevelDoublyLinkedList();

    @Test
    public void test1() {
        var head = new FlattenMultilevelDoublyLinkedList.Node(1);
        var node2 = new FlattenMultilevelDoublyLinkedList.Node(2);
        var node3 = new FlattenMultilevelDoublyLinkedList.Node(3);
        var node4 = new FlattenMultilevelDoublyLinkedList.Node(4);
        var node5 = new FlattenMultilevelDoublyLinkedList.Node(5);
        var node6 = new FlattenMultilevelDoublyLinkedList.Node(6);
        var node7 = new FlattenMultilevelDoublyLinkedList.Node(7);
        var node8 = new FlattenMultilevelDoublyLinkedList.Node(8);
        var node9 = new FlattenMultilevelDoublyLinkedList.Node(9);
        var node10 = new FlattenMultilevelDoublyLinkedList.Node(10);
        var node11 = new FlattenMultilevelDoublyLinkedList.Node(11);
        var node12 = new FlattenMultilevelDoublyLinkedList.Node(12);
        setNext(head, node2);
        setNext(node2, node3);
        setNext(node3, node4);
        setNext(node4, node5);
        setNext(node5, node6);
        setNext(node7, node8);
        setNext(node8, node9);
        setNext(node9, node10);
        setNext(node11, node12);
        node3.child = node7;
        node8.child = node11;
        doTest(solution.solve(head), List.of(1, 2, 3, 7, 8, 11, 12, 9, 10, 4, 5, 6));
    }

    @Test
    public void test2() {
        var head = new FlattenMultilevelDoublyLinkedList.Node(1);
        var node2 = new FlattenMultilevelDoublyLinkedList.Node(2);
        var node3 = new FlattenMultilevelDoublyLinkedList.Node(3);
        setNext(head, node2);
        head.child = node3;
        doTest(solution.solve(head), List.of(1, 3, 2));
    }

    private void setNext(FlattenMultilevelDoublyLinkedList.Node prev, FlattenMultilevelDoublyLinkedList.Node next) {
        prev.next = next;
        next.prev = prev;
    }

    private void doTest(FlattenMultilevelDoublyLinkedList.Node head, List<Integer> expectedList) {
        List<Integer> list = new LinkedList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Assertions.assertEquals(expectedList, list);
    }

}
