class Node {
    int data;
    Node prev;
    Node next;

    public Node(int x) {
        data = x;
        prev = null;
        next = null;
    }
    
}

public class DoublyLinkedList {

    static void printList(Node head){
        if(head == null){
            return;
        }
        Node curr = head;

        System.out.print("null <- " + curr.data);

        curr = curr.next;
        while(curr != null){
            System.out.print(" <-> " + curr.data);
            curr = curr.next;
        }
        System.out.println(" -> null");
    }
    
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.prev = null;
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        temp2.next = null;

        printList(head);
    }
}
