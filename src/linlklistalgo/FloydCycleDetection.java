package linlklistalgo;

import java.util.HashMap;

public class FloydCycleDetection {
    public static boolean calculateLength(ListNode ListNode){
        ListNode temp = ListNode;
        // Create a map to keep track of
        // encountered ListNodes
        HashMap<ListNode, Integer> ListNodeMap = new HashMap<>();

        // Step 2: Traverse the linked list
        while (temp != null) {
            // If the ListNode is already in the
            // map, there is a loop
            if (ListNodeMap.containsKey(temp)) {
                return true;
            }
            // Store the current ListNode
            // in the map
            ListNodeMap.put(temp, 1);

            // Move to the next ListNode
            temp = temp.next;
        }

        // Step 3: If the list is successfully traversed 
        // without a loop, return false
        return false;
    }

    public static void main(String[] args) {
        // Create a sample linked list
        // with a loop for testing

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;

        // Check if there is a loop 
        // in the linked list
        if (calculateLength(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }

    }
}
