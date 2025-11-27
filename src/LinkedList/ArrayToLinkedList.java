package LinkedList;

public class ArrayToLinkedList {

    public static Node arrayToLL(int[] array){
        if(array.length==0){
            System.out.println("array is null");

        }
        Node head= new Node(array[0]);
        Node mover = head;
        for(int i=1;i<array.length;i++){
            Node temp = new Node(array[i]);
            mover.setNext(temp);
            mover = temp;
        }
        return head;
    }
}
