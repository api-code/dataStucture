package LinkedList;

public class CountOfNode {

    public static int countLength(Node newNode) {
        Node temp = newNode;
        int count = 0;
        if(newNode == null){
            return 0;
        }
        if (newNode.getNext() == null) {
            return 1;
        }
//        if(newNode.getNext() == newNode.getPrev()){
//            return -1;
//        }
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
            count++;
        }
        System.out.println();
        System.out.println("count of node is :" + count);
        return count;
    }
}
