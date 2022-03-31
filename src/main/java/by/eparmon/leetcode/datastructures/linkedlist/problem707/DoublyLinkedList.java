package by.eparmon.leetcode.datastructures.linkedlist.problem707;

public class DoublyLinkedList {

    private Node head;

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
        head = new Node(val, head, null);
        if (head.next != null) {
            head.next.prev = head;
        }
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
        node.next = new Node(val, null, node);
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node previous = getNode(index - 1);
        if (previous != null) {
            Node newNode = new Node(val, previous.next, previous);
            if (previous.next != null) {
                previous.next.prev = newNode;
            }
            previous.next = newNode;
        }
    }

    public void deleteAtIndex(int index) {

        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        Node node = getNode(index);
        if (node != null) {
            node.prev.next = node.next;
            if (node.next != null) {
                node.next.prev = node.prev;
            }
        }
    }


    private static class Node {

        private final int value;

        private Node prev;
        private Node next;

        private Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }


}
