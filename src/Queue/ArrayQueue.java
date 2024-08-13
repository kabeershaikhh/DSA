package Queue;

public class ArrayQueue {
    int MAX_SIZE;
    private int[] queueArray;
    private int front=-1;
    private int rear=-1;
    private int size=0;

    public ArrayQueue(int MAX_SIZE) {
        queueArray = new int[MAX_SIZE];
        this.size = 0;
        this.MAX_SIZE=MAX_SIZE;
    }

    public void enqueue(int task) {
        if (size == MAX_SIZE) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        if (front==-1) {
            front=0;
        }
        rear = (rear + 1) % MAX_SIZE;
        queueArray[rear] = task;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;  }
        int removedTask = queueArray[front];
        if (front==rear) {
            front=rear=-1;
        }
        else{
            front=(front+1)%MAX_SIZE;
        }
        size--;
        return removedTask;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public int getSize() {
        return size;
    }
    int peek(){
        if (isEmpty()) {
            System.out.println("list is empty");
            return -1;
        }
        return queueArray[front];
    }
    public static void main(String[] args) {
        ArrayQueue taskQueue = new ArrayQueue(5);

        taskQueue.enqueue(1);
        taskQueue.enqueue(2);
        taskQueue.enqueue(3);
        taskQueue.enqueue(4);
        taskQueue.enqueue(5);
        taskQueue.dequeue();
        taskQueue.enqueue(6);

        while (!taskQueue.isEmpty()) {
            System.out.println("Dequeued task: " + taskQueue.dequeue());
        }
        System.out.println(taskQueue.dequeue());
    }
}
    
