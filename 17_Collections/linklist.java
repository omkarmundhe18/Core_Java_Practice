public class linklist {

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

    public static void main(String[] args) {

        // Step 3: Create LinkedList Object
        linklist list = new linklist();

        // Step 4: Create Nodes
        list.head = new Node(10);

        Node second = new Node(20);
        Node third = new Node(30);

        // Step 5: Connect Nodes
        list.head.next = second;
        second.next = third;

        // Step 6: Display LinkedList
        Node current = list.head;

        while (current != null) {

            System.out.print(current.data + " -> ");

            current = current.next;
        }

        System.out.println("null");
    }
}