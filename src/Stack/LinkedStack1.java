package Stack;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedStack1 {
    private Node top;
    private int max;
    private int size;

    public LinkedStack1(int max) {
        this.top = null;
        this.max = max;
        this.size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; 
        }

        int poppedData = top.data;
        top = top.next;
        size--;
        return poppedData;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; 
        }

        return top.data;
    }

    public int search(int searchData) {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        }
        else {
            Node current = top;
            int position = 1;

            while (current != null) {
                if (current.data == searchData) {
                    return position;
                }

                current = current.next;
                position++;
            }

            return -1; 
        }
    }

    public void display() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + "  ");
            current = current.next;
        }

    }


    public static void main(String[] args) {
        LinkedStack1 stack = new LinkedStack1(5);

        for(int i=1;i<=5;i++){
            stack.push(i+2);
        }

        System.out.println("Stack after pushing elements:");
        stack.display();

        System.out.println("\nPeek: " + stack.peek());

        System.out.println("Search for  Position " + stack.search(10));


        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());}}