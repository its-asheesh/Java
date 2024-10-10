class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
public class DeleteLastNode {
    
    static Node deleteTail(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
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

        System.out.println("Origional List :");
        printList(head);

        deleteTail(head);
        System.out.println("List after deletion of tail :");
        printList(head);
    }
}
