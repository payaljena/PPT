
// import org.w3c.dom.Node;

// public class LinkedList {
//     private Node head;
//     public void insertAtBegging(int data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         newNode.link = head;
//         head = newNode;
//    }
// }
// =====================================================

// class Node {
//     int data;
//     Node next;
    
//     public Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// public class LinkedListDeletionFromBeginning {
//     Node head;
    
//     public static void main(String[] args) {
//         LinkedListDeletionFromBeginning list = new LinkedListDeletionFromBeginning();
        
//         // Insert elements
//         list.head = new Node(10);
//         list.head.next = new Node(20);
//         list.head.next.next = new Node(30);
//         list.head.next.next.next = new Node(40);
        
//         System.out.println("Original Linked List:");
//         list.printList();
        
//         // Delete from beginning
//         list.deleteFromBeginning();
        
//         System.out.println("\nLinked List after deletion from beginning:");
//         list.printList();
//     }
    
//     // Method to delete from beginning
//     public void deleteFromBeginning() {
//         if (head == null) {
//             System.out.println("List is empty. Nothing to delete.");
//             return;
//         }
        
//         head = head.next;
//     }
    
//     // Method to print the linked list
//     public void printList() {
//         Node current = head;
//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }
//     }
// }
//=============================================================
class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListDeletionFromEnd {
    Node head;
    
    public static void main(String[] args) {
        LinkedListDeletionFromEnd list = new LinkedListDeletionFromEnd();
        
        // Insert elements
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        
        System.out.println("Original Linked List:");
        list.printList();
        
        // Delete from end
        list.deleteFromEnd();
        
        System.out.println("\nLinked List after deletion from end:");
        list.printList();
        
        // Delete more elements to show multiple deletions
        list.deleteFromEnd();
        System.out.println("\nAfter second deletion from end:");
        list.printList();
        
        // Try deleting from empty list
        list.deleteFromEnd();
        list.deleteFromEnd();
        list.deleteFromEnd();
    }
    
    // Method to delete from end
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("\nList is empty. Nothing to delete.");
            return;
        }
        
        // If there's only one node
        if (head.next == null) {
            head = null;
            return;
        }
        
        // Find the second last node
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        
        // Change next of second last node to null
        secondLast.next = null;
    }
    
    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}