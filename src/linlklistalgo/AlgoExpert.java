package linlklistalgo;

import LinkedList.Node;

public class AlgoExpert {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addFirst(10);
        list.addFirst(5);
        list.addLast(20);
        list.addAtIndex(1, 7);
        list.addAtIndex(10, 99); // index > length → goes to end

        list.printList();
        int count = FloydCycleDetection.calculateLenght(list.getHead());
        System.out.println(count);
    }
}
