// Definition of the Node class
class Node {
    int data; // Data to be stored in the node
    Node next; // Reference to the next node in the list
    
    // Constructor to initialize the node with data and set the next node as null
    Node(int x) {
        data = x;
        next = null;
    }   
}

// Definition of the InsertAtBegin class
public class InsertAtBegin {

    // Method to insert a node at the beginning of the linked list
    static Node insertBegin(Node head, int x) {
        Node temp = new Node(x); // Create a new node with the given value
        temp.next = head; // Set the next reference of the new node to the current head
        return temp; // Return the new node, which becomes the new head
    }

    // Method to print the linked list in a well-formatted manner
    static void printList(Node head) {
        if (head == null) { // Base case: if the list is empty, return
            return;
        }
        
        // Print the heading
        System.out.println("Singly Linked List:");
        
        // Traverse and print the list
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data); // Print current node's data
            if (curr.next != null) {
                System.out.print(" -> "); // Print arrow between nodes
            }
            curr = curr.next; // Move to the next node
        }
        System.out.println(); // Print new line after the list
    }

    // Main method to test inserting at the beginning and printing the list
    public static void main(String[] args) {
        Node head = null; // Initialize an empty linked list
        
        // Insert nodes at the beginning of the list
        head = insertBegin(head, 30); // Insert 30 at the beginning
        head = insertBegin(head, 20); // Insert 20 at the beginning
        head = insertBegin(head, 10); // Insert 10 at the beginning
        
        // Print the linked list after all insertions
        printList(head);
    }
}
