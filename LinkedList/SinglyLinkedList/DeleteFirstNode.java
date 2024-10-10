class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

class DeleteFirstNode{

    static Node deleteHead(Node head){
        if(head == null){
            return null;
        }else{
            return head.next;
        }
        
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

        System.out.println("Singly Linked List before deletion of first node : ");
        printList(head);

        head = deleteHead(head);
        System.out.println("Singly Linked List after deletion of first node : ");
        printList(head);
    }
}