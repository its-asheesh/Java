class Node{
    int data;
    Node next;

    public Node(int x) {
        data = x;
        next = null;
    }
    
}

public class InsertAtEnd {
    static Node insertEnd(Node head, int x){
        Node temp = new Node(x);
        if(head == null){
            return temp;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        return  head;
    }

    static void printList(Node head){
        if(head == null){
            return;
        }
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);

        System.out.print("Original List : ");
        printList(head);

        insertEnd(head, 30);

        System.out.print("List after insertion of tail : ");
        printList(head);
    }
}
