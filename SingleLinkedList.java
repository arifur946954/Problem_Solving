import java.util.Scanner;

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class LinkedList {
    private Node head;

    // Insert data at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If list is empty, new node is the head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the last node
            }
            current.next = newNode; // Append the new node
        }
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// Main class
public class SingleLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Insert Data");
            System.out.println("2. Display List");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    int data = scanner.nextInt();
                    list.insert(data);
                    break;
                case 2:
                    System.out.println("Current Linked List:");
                    list.display();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
