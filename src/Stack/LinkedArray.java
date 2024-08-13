package Stack;

import java.util.LinkedList;

public class LinkedArray {
    private LinkedList<Object> linkedList;

    public LinkedArray() {
        linkedList = new LinkedList<>();
    }

    public void push(Object element) {
        
        linkedList.addFirst(element);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop from an empty stack.");
        }
        return linkedList.removeFirst();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek into an empty stack.");
        }
        return linkedList.getFirst();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public int size() {
        return linkedList.size();
    }

    public static void main(String[] args) {
        LinkedArray stack = new LinkedArray();

        stack.push(42);
        stack.push("Hello");
        stack.push(3.14);

        System.out.println("Peek: " + stack.peek());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        System.out.println("Is empty? " + stack.isEmpty());

        System.out.println("Size of stack: " + stack.size());
    }
}
