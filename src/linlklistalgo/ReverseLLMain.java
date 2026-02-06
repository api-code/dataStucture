package linlklistalgo;

import static linlklistalgo.ReverseLinkedList.printLLS;
import static linlklistalgo.ReverseLinkedList.reverse;

public class ReverseLLMain {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next= new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

//        ListNode temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
        reverse(head);
        printLLS(head);

        ListNode newHead = reverse(head);

//        ListNode dtemp = newHead;
//        while (dtemp != null) {
//            System.out.print(dtemp.data + " ");
//            dtemp = dtemp.next;
//        }
    }
}
