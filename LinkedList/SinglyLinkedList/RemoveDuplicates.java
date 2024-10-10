class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

public class RemoveDuplicates {
    static void removeDuplicates(Node head){
        Node curr = head;
        while(curr != null && curr.next != null){
            if (curr.data == curr.next.data){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
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
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = new Node(30);

        System.out.print("Orignal List : ");
        printList(head);
        System.out.println();

        System.out.print("List after removal of duplicates : ");
        removeDuplicates(head);
        printList(head);
        System.out.println();
    }    
}
