package by.eparmon.leetcode.datastructures.linkedlist;

public class MyLinkedList {

    private Node head;

    public MyLinkedList() {

    }

    public int get(int index) {
        Node node = getNode(index);
        return node == null ? -1 : node.value;
    }

    private Node getNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            if (node == null) {
                return null;
            }
            node = node.next;
        }
        return node;
    }

    public void addAtHead(int val) {
        head = new Node(val, head);
    }

    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node(val, null);
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node previous = getNode(index - 1);
        if (previous != null) {
            previous.next = new Node(val, previous.next);
        }
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            head = head.next;
            return;
        }
        Node previous = getNode(index - 1);
        if (previous != null && previous.next != null) {
            previous.next = previous.next.next;
        }
    }


    private static class Node {

        private final int value;

        private Node next;

        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

}
