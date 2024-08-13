package Queue;


public class LinkedListQueue {
   
    static class Node {
        int data;
        Node next;

       public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node front;
    private Node rear;
    private int size;

    public LinkedListQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(int task) {
        Node newNode = new Node(task);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;   }
        size++;
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }
        int removedTask = front.data;
        front = front.next;
        size--;
        return removedTask;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LinkedListQueue taskQueue = new LinkedListQueue();

        taskQueue.enqueue(1);
        taskQueue.enqueue(2);
        taskQueue.enqueue(3);

        while (!taskQueue.isEmpty()) {
            System.out.println("Dequeued task: " + taskQueue.dequeue());
        }
    }
}

