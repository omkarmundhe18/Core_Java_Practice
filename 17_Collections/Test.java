public class test{

    // Step 1: Node Class
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Step 2: Head Node
    Node head;

    // Step 3: Insert at Beginning
    void insertBeginning(int data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Step 4: Insert at End
    void insertEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Step 5: Delete First Node
    void delete() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        head = head.next;
    }

    // Step 6: Display LinkedList
    void display() {

        Node current = head;

        while (current != null) {

            System.out.print(current.data + " -> ");

            current = current.next;
        }

        System.out.println("null");
    }

    // Step 7: Main Method
    public static void main(String[] args) {

        // Create Object
        linklist list = new linklist();

        // Insert Beginning
        list.insertBeginning(20);
        list.insertBeginning(10);

        // Insert End
        list.insertEnd(30);
        list.insertEnd(40);

        // Delete First Node
        list.delete();

        // Display LinkedList
        list.display();
    }
}