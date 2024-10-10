class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

public class PrintNthLastNode {
    static void printNthLastNode(Node head, int pos){
        if(head == null){
            return;
        }
        int len = 0;
        Node curr = head;
        for(curr = head; curr != null ; curr = curr.next){
            len++;
        }

        if (pos > len) {
            System.out.println("Invalid position");
            return;
        }

        curr = head;
        for (int i = 1; i < (len - pos + 1); i++) {
            curr = curr.next;
        }
        System.out.print("Node "+pos+ " from the end : "+curr.data);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        

        printNthLastNode(head, 2);
        System.out.println();
    }
}
