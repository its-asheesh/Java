
import java.util.Scanner;

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

// Definition of the SearchNode class
public class SearchNode {

    // Method to search for a node with the given value in the linked list
    static int searchNode(Node head, int n) {
        int pos = 1; // Position starts at 1
        Node curr = head; // Initialize the current node as head
        
        // Traverse the list until the end
        while (curr != null) {
            if (curr.data == n) { // If the current node's data matches the search value
                return pos; // Return the position
            } else {
                pos++; // Increment the position
                curr = curr.next; // Move to the next node
            }
        }
        return -1; // If the value is not found, return -1
    }

    // Main method to create a linked list and search for a node
    public static void main(String[] args) {
        // Creating nodes of the linked list
        Node head = new Node(10);           // First node with data 10
        head.next = new Node(20);           // Second node with data 20
        head.next.next = new Node(30);      // Third node with data 30
        head.next.next.next = new Node(40); // Fourth node with data 40

        System.out.print("Enter the node to be seached : ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        // Searching for the value n in the linked list
        int position = searchNode(head, n);

        // Output the result of the search
        if (position != -1) {
            System.out.println("Node found at position: " + position);
        } else {
            System.out.println("Node not found in the list.");
        }
    }
}
