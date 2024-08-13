package Queue;

public class ArrayQueue3 {
    int MAX_SIZE;
    int front=-1;
    int rear=-1;
    int size=0;
    int[] arr;

    ArrayQueue3(int MAX_SIZE){
        this.MAX_SIZE=MAX_SIZE;
        arr=new int[MAX_SIZE];
        this.size=0;
    }
    boolean isEmpty(){
        return size==0;
    }
    void enqueue(int data){
        if (size==MAX_SIZE) {
            System.out.println("Queue is Full!");
            return;
        }
        if (front==-1) {
            front=0;
        }
        rear=(rear+1)%MAX_SIZE;
        arr[rear]=data;
        size++;
    }
    int dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int task=arr[front];
        if (front==rear) {
            front=rear=-1;
        }
        else{

            front=(front+1)%MAX_SIZE;
        }
        size--;
        return task;
    }
}
