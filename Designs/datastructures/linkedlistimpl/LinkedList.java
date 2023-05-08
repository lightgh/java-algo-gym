package datastructures.linkedlistimpl;

public class LinkedList {
    Node head; // head of the list

    static class Node {
        int data;
        Node next;



        Node(int d){
            data = d;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data){
        Node new_node = new Node(data);

        if (list.head == null) {
            list.head = new_node;
        }else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            // insert the new node at the last node
            last.next = new_node;
        }
        return list;
    }

    public static LinkedList delete(LinkedList list, int data){
        Node currenthead = list.head;
        Node prev;

        if(currenthead.data == data){
            list.head = currenthead.next;
        }else{
            while(currenthead.next != null){
                prev = currenthead;
                currenthead = currenthead.next;
                if(currenthead.data == data){
                    prev.next = currenthead.next;
                }
            }
        }
        return list;
    }

    public static void printList(LinkedList list){
        Node curNode = list.head;

        System.out.println("LinkedList: ");
        while(curNode != null){
            System.out.println(curNode.data + " ");
            curNode = curNode.next;
        }

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // ******* INSERTION **********
        // insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);

        printList(list);

        System.out.println("DELETING LIST-VALUE: " + 3);
        delete(list, 3);
        delete(list, 2);
        printList(list);

    }
}
