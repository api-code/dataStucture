package linlklistalgo;

public class ReverseLinkedList {

    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next=prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public static void printLLS(ListNode head){
        ListNode newHead = reverse(head);

        while (newHead != null) {
            System.out.print(newHead.data + " ");
            newHead = newHead.next;

        }
    }
}
