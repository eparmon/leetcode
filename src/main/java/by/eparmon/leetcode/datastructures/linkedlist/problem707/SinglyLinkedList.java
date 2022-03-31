package by.eparmon.leetcode.datastructures.linkedlist.problem707;

/**
 * Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
 * A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and
 * next is a pointer/reference to the next node.
 * If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the
 * linked list. Assume all nodes in the linked list are 0-indexed.
 * <p>
 * Implement the MyLinkedList class:
 * <ul>
 * <li>MyLinkedList() Initializes the MyLinkedList object.</li>
 * <li>int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.</li>
 * <li>void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion,
 * the new node will be the first node of the linked list.</li>
 * <li>void addAtTail(int val) Append a node of value val as the last element of the linked list.</li>
 * <li>void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. If index
 * equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.</li>
 * <li>void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.</li>
 * </ul>
 * <p>
 * <a href="https://leetcode.com/problems/design-linked-list/">Leetcode</a>
 */
public class SinglyLinkedList {

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
