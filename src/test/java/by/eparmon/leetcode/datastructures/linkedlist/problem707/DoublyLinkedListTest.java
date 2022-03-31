package by.eparmon.leetcode.datastructures.linkedlist.problem707;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoublyLinkedListTest {

    @Test
    public void test1() {
        var list = new DoublyLinkedList();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1, 2);
        Assertions.assertEquals(2, list.get(1));
        list.deleteAtIndex(1);
        Assertions.assertEquals(3, list.get(1));
    }

    @Test
    public void test2() {
        var list = new DoublyLinkedList();
        list.addAtHead(1);
        list.deleteAtIndex(0);
    }

    @Test
    public void test3() {
        var list = new DoublyLinkedList();
        list.addAtHead(7);
        list.addAtHead(2);
        list.addAtHead(1);
        list.addAtIndex(3, 0);
        list.deleteAtIndex(2);
        list.addAtHead(6);
        list.addAtTail(4);
        Assertions.assertEquals(4, list.get(4));
    }
}
