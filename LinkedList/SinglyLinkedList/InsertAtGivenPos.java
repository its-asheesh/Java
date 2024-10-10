class Node {
    int data;
    Node next;

    public Node(int x) {
        data = x;
        next = null;
    }
}

public class InsertAtGivenPos {
    
    // Method to insert at a given position
    static Node insertAtGivenPos(Node head, int pos, int x) {
        Node temp = new Node(x);
        
        // Handle insertion at the head
        if (pos == 1) {
            temp.next = head;
            return temp;
        }
        
        Node curr = head;
        
        // Traverse to the node just before the desired position
        for (int i = 1; i <= pos - 2; i++) {
            if (curr == null) {
                System.out.println("Position is beyond the length of the list. No insertion made.");
                return head;  // Invalid position, return the original list
            }
            curr = curr.next;
        }
        
        // Insert the new node in the desired position
        if (curr != null) {
            temp.next = curr.next;
            curr.next = temp;
        } else {
            System.out.println("Position is beyond the length of the list. No insertion made.");
        }
        
        return head;
    }
    
    // Method to print the linked list
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println(); // Print a new line at the end
    }
    
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(40);
        
        System.out.println("Original list:");
        printList(head);
        
        // Insert 30 at position 2
        head = insertAtGivenPos(head, 2, 30);
        
        System.out.println("After inserting 30 at position 2:");
        printList(head);
        
        // Attempt to insert at a position beyond the list's length
        head = insertAtGivenPos(head, 10, 50);
        System.out.println("After attempting to insert 50 at position 10:");
        printList(head);
    }
}
