class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class DeleteNodeAtGivenPos {
    static Node deleteGivenPos(Node head,int pos){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        Node curr = head;
        for (int i = 1; i < pos - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

    static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Origional List :");
        printList(head);

        deleteGivenPos(head,3);
        System.out.println("Updated List :");
        printList(head);
    }
    
}
