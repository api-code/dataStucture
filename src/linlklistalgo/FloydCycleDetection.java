package linlklistalgo;

import LinkedList.Node;

public class FloydCycleDetection {
    public static int calculateLenght(Node head){
        if (head == null) {
            return 0;
        }
        //detecting the cycle of LL
        Node fast=head;
        Node slow=head;
        while(fast != null && fast.getNext()!=null){
            slow=slow.getNext();
            fast=fast.getNext().getNext();

            if(fast == slow){
                return -1;
            }
        }

        //count the length
        int count=0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.getNext();
        }
        return count;
    }
}
