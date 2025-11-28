package linlklistalgo;

import LinkedList.Node;

public class MyLinkedList {
    private Node head;

    // Add at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    // Add at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode.getNext());
    }

    // Add at kth position (0-based index)
    public void addAtIndex(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int count = 0;

        while (temp != null && count < index - 1) {
            temp = temp.getNext();
            count++;
        }

        // If index is greater than length -> insert at tail
        if (temp == null) {
            addLast(data);
            return;
        }

        newNode.setNext(temp.getNext()); // set newNode.next = temp.next
        temp.setNext(newNode);
    }

    // Print the list
    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }

    public Node getHead() {
        return head;
    }

    public static void deleteHead(Node head) {
        head = head.getNext();
    }
    public static void deleteTail(Node head) {

    }
    public static void deleteKEle(Node head) {

    }

}
