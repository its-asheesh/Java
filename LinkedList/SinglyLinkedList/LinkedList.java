// Definition of the Node class
class Node {
    int data; // Data to be stored in the node
    Node next; // Reference to the next node in the list
    
    // Constructor to initialize the data and set the next node as null
    Node(int x) {
        data = x;
        next = null;
    }
}

// Definition of the LinkedList class
class LinkedList {

    // Method to print the linked list in a more readable format
    static void printList(Node head) {
        System.out.println("Singly Linked List:"); // Heading for the linked list
        Node curr = head; // Initialize the current node as head
        while (curr != null) { // Traverse the list until the end
            // Print the data and point to the next node with an arrow
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next; // Move to the next node
        }
        System.out.println(); // Move to the next line after printing the list
    }

    // Main method to create a linked list and print it
    public static void main(String[] args) {
        // Creating nodes of the linked list
        Node head = new Node(10);  // First node with data 10
        Node temp1 = new Node(20); // Second node with data 20
        Node temp2 = new Node(30); // Third node with data 30
        
        // Linking nodes together to form the list
        head.next = temp1;  // head -> temp1
        temp1.next = temp2; // temp1 -> temp2
        
        // Print the linked list
        printList(head);
    }
}
