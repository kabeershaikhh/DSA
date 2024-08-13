package Queue;

public class ArrayQueue2 {
    int[] arr;
    int max;
    int rear=-1;
    int size;
    ArrayQueue2(int a){
        this.max=a;
        this.size=0;
        arr=new int[a];
    }

    boolean isEmpty(){
        return size==0;
    }
    void add(int value){
        if (size==max) {
            System.out.println("Queue is Full!");
            return;
        }
        size++;
        arr[++rear]=value;
    }
    int remove(){
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int front=arr[0];
        for (int i = 0; i <rear; i++) {
           arr[i]=arr[i+1]; 
        }
        rear--;
        size--;
        return front;
    }
    int peek(){
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int front=arr[0];
        return front;
    }

    public static void main(String[] args) {
        ArrayQueue2 queue=new ArrayQueue2(10);
        queue.add(12);
        queue.add(13);
        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
            
        }
    }
}

