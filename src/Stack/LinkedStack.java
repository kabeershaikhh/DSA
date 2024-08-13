package Stack;


public class LinkedStack {
    static class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node top;
    private int size;

    public LinkedStack() {
        this.top = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }
 
    public int getSize() {
        return size;
    }
    public boolean search(int element) {
        Node current = top;
        while (current != null) {
            if (current.data == element) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int poppedElement = top.data;
        top = top.next;
        size--;
        return poppedElement;
    }
    public void display() {
        Node current = top;
        System.out.println("Stack: ");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
       LinkedStack stack = new LinkedStack();

        System.out.println("Pushing 10 values onto the stack:");
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }
        System.out.println("Popping elements from the stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
