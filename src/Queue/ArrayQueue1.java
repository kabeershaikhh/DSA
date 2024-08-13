package Queue;

interface Queue {
    public void add(Object data, Object string);
   
    public Object first();
   
    public Object remove();
    
    public int size();
   
    public static class Node{};
   } 
public class ArrayQueue1 implements Queue {

    private Object[] queueArray1;
    private Object[] queueArray2;

    private int size;

    ArrayQueue1(int capacity){
        queueArray1= new Object[capacity];
        queueArray2=new Object[capacity];
        this.size=0;

    }
   
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queueArray1.length;
    }

    public int size() {
        return size;
    }

    public void add(Object data, Object string) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add.");
            return;
        }
        Object[] queueArray=new Object[2];
        queueArray[0] = data;
        queueArray[1]=string;
        size++;
    }

    public Object first() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No first element.");
            return -1; 
        }
        Object[] queueArray=new Object[2];
        queueArray[0]=queueArray1[0];
        queueArray[1]=queueArray2[1];

        return queueArray;
    }

    // public Object remove() {
    //     if (isEmpty()) {
    //         System.out.println("Queue is empty. Cannot remove.");
    //         return -1; 
    //     }
    //     Object removedItem = queueArray[0];
    //     for (int i = 0; i < size - 1; i++) {
    //         queueArray[i] = queueArray[i + 1];
    //     }
    //     size--;
    //     return removedItem;
    // }
    public static void main(String[] args) {
        ArrayQueue1 queue = new ArrayQueue1(5);

        queue.add(1,"qw");
        queue.add(2,"qwe");
        queue.add(3,"aef");
       
        System.out.println("First element: " + queue.first());
        System.out.println("Queue size: " + queue.size());

      //  System.out.println("Remove: " + queue.remove());
        System.out.println("First element after remove: " + queue.first());
        System.out.println("Queue size after remove: " + queue.size());
    }

    
    }

