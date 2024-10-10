class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

public class SortedInsert {
    static Node sortedInsert(Node head, int x){
        Node temp = new Node(x);
        if(head == null){
            return temp;
        }
        if(x < head.data){
            temp.next = head;
            return temp;
        }

        Node curr = head;
        while(curr.next != null && curr.next.data < x){
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    static void printList(Node head){
        Node curr = head;
        if(head == null){
            return;
        }
        while(curr != null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Singly Linked List before insertion of node : ");
        printList(head);

        head = sortedInsert(head, 25);
        System.out.println("Singly Linked List after insertion of node : ");
        printList(head);
    }
}
