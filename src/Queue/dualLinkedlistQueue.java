package Queue;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Queue {
    private Node head, tail;

    public Queue() {
        this.head = this.tail = null;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return head == null;
    }

    // add an item to the queue
    public void add(int data) {
        Node newNode = new Node(data);

        // If the queue is empty, make the new node both head and tail
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }

        // Otherwise, add the new node to the tail and update pointers
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // remove an item from the queue
    public void remove() {
        // If the queue is empty, do nothing
        if (isEmpty()) {
            return;
        }

        // If there is only one node, set head and tail to null
        if (head == tail) {
            head = tail = null;
        } else {
            // Otherwise, move head to the next node and update pointers
            head = head.next;
            head.prev = null;
        }
    }

    // Print the elements of the queue
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class dualLinkedlistQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue elements:");
        queue.display();

        queue.remove();

        System.out.println("Queue elements after remove:");
        queue.display();
    }
}
