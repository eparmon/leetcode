package by.eparmon.leetcode.datastructures.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

    @Test
    public void test1() {
        var linkedList = new MyLinkedList();
        linkedList.addAtTail(1);
        Assertions.assertEquals(1, linkedList.get(0));
    }

    @Test
    public void test2() {
        var linkedList = new MyLinkedList();
        linkedList.addAtHead(2);
        linkedList.deleteAtIndex(1);
        linkedList.addAtHead(2);
        linkedList.addAtHead(7);
        linkedList.addAtHead(3);
        linkedList.addAtHead(2);
        linkedList.addAtHead(5);
        linkedList.addAtTail(5);
        Assertions.assertEquals(2, linkedList.get(5));
        linkedList.deleteAtIndex(6);
        linkedList.deleteAtIndex(4);
    }

    @Test
    public void test3() {
        var linkedList = new MyLinkedList();
        linkedList.addAtTail(1);
        linkedList.addAtTail(3);
        Assertions.assertEquals(3, linkedList.get(1));
    }

}
