package LinkedList;

public class DoublyLinkedListNode {
    int data;
    DoublyLinkedListNode prev;
    DoublyLinkedListNode next;

    public DoublyLinkedListNode(int data) {
        this.data = data;
        this.prev=null;
        this.next=null;
    }

    public DoublyLinkedListNode(int data, DoublyLinkedListNode prev, DoublyLinkedListNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

}
