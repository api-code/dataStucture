import LinkedList.ArrayToLinkedList;
import LinkedList.Node;

//import static LinkedList.CountOfNode.countLength;
import static linlklistalgo.FloydCycleDetection.calculateLenght;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {5,2,7,3,8,9,1};
//        int[] arr = {9};

        Node newNode = ArrayToLinkedList.arrayToLL(arr);
        System.out.println(newNode.getData());
        int count = calculateLenght(newNode);
        System.out.println("length of Linkedlist is:"+count);

    }
}