import java.util.Scanner;

class Node {
    char data;
    Node prev;
    Node next;
    Node(char x) {
        data = x;
        prev = null;
        next = null;
    }
}

public class InsertAtEnd {

    static Node insertTail(Node head, char x){
        Node temp = new Node(x);
        if(head == null){
            return temp;
        }

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        temp.next = null;

        return head;
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
        Node head = new Node('a');
        Node temp1 = new Node('b');
        head.prev = null;
        head.next = temp1;
        temp1.prev = head;
        temp1.next = null;

        System.out.println("Enter the character to be inserted at the end:");
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);

        head = insertTail(head, x);
        printList(head);
    }
}
