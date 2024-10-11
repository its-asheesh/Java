import java.util.Scanner;

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

public class InsertAtBegin {

    static Node insertHead(Node head, int x){
        Node temp = new Node(x);
        if(head == null){
            return temp;
        }
        temp.next = head;
        head.prev = temp;
        return temp;
    }

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
        head.prev = null;
        head.next = temp1;
        temp1.prev = head;
        temp1.next = null;

        System.out.println("Enter the head to be inserted :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        head = insertHead(head, x);
        printList(head);
    }
    
}
