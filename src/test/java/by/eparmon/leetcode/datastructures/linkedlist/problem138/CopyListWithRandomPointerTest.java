package by.eparmon.leetcode.datastructures.linkedlist.problem138;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CopyListWithRandomPointerTest {

    private CopyListWithRandomPointer solution = new CopyListWithRandomPointer();

    @Test
    public void test() {
        var head = new CopyListWithRandomPointer.Node(7);
        var node2 = new CopyListWithRandomPointer.Node(13);
        var node3 = new CopyListWithRandomPointer.Node(11);
        var node4 = new CopyListWithRandomPointer.Node(10);
        var node5 = new CopyListWithRandomPointer.Node(1);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node2.random = head;
        node3.random = node5;
        node4.random = node3;
        node5.random = head;
        CopyListWithRandomPointer.Node newHead = solution.solve(head);
        removeNode(head);
        removeNode(node2);
        removeNode(node3);
        removeNode(node4);
        removeNode(node5);
        var newNode2 = newHead.next;
        var newNode3 = newNode2.next;
        var newNode4 = newNode3.next;
        var newNode5 = newNode4.next;
        Assertions.assertNull(newNode5.next);
        Assertions.assertEquals(7, newHead.val);
        Assertions.assertEquals(13, newNode2.val);
        Assertions.assertEquals(11, newNode3.val);
        Assertions.assertEquals(10, newNode4.val);
        Assertions.assertEquals(1, newNode5.val);
        Assertions.assertNull(newHead.random);
        Assertions.assertEquals(newHead, newNode2.random);
        Assertions.assertEquals(newNode5, newNode3.random);
        Assertions.assertEquals(newNode3, newNode4.random);
        Assertions.assertEquals(newHead, newNode5.random);
    }

    private void removeNode(CopyListWithRandomPointer.Node node) {
        node.val = -1;
        node.next = null;
        node.random = null;
    }

}
