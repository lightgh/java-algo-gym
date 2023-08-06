package twopointer;

public class Main {

    public static void main(String[] args) {

        int[][] inputArrayData = {
            {1, 2, 3},
            {23, 89, 23, 23, 11, 22, 3, 90},
            {89, 10, 45, 11, },
            {81, 99, 8, 8, 78, 90}
        };

        int [] n = {2, 5, 3, 4};


        for(int i = 0; i < inputArrayData.length; i++){
            LinkedList<Integer> linkedList = new LinkedList<Integer>();
            linkedList.createLinkedList(inputArrayData[i]);
            System.out.println("Before removing elements: ");
            PrintList.printListsWithForwardArrow(linkedList.head);
            System.out.println("\nafter removing element at " + n[i] + " th position from the end of the list");
            RemoveNthNode.removeNthLastNode(linkedList.head, n[i]);
            PrintList.printListsWithForwardArrow(linkedList.head);
            System.out.print("\n");
        }

    }
}


class RemoveNthNode {
    public static LinkedListNode removeNthLastNode(LinkedListNode head, int n ) {
        LinkedListNode left = head;
        LinkedListNode right = head;

        for(int i = 0; i < n; i++){
            right = right.next;
        }

        if(right == null) return head.next;

        while(right.next != null){
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;

        return head;
    }
}