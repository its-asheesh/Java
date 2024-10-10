class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

public class ReverseList {
    static Node reverseList(Node head){
        Node curr = head;
        Node prev = null;
        while (curr != null) { 
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
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
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("Orignal List : ");
        printList(head);
        System.out.println();

        System.out.print("Reveresed List : ");
        head = reverseList(head);
        printList(head);
        System.out.println();
    }    
}
