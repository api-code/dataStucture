package LinkedList;

public class DoublyLinkedList {
    public static void main(String[] args) {
        // Create the first node (head of the list)
        DoublyLinkedListNode head = new DoublyLinkedListNode(10);

        // Create and link the second node
        head.next = new DoublyLinkedListNode(20);
        head.next.prev = head;

        // Create and link the third node
        head.next.next = new DoublyLinkedListNode(30);
        head.next.next.prev = head.next;

        // Create and link the fourth node
        head.next.next.next = new DoublyLinkedListNode(40);
        head.next.next.next.prev = head.next.next;

        DoublyLinkedListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp=temp.next;
        }

    }
}
