package Stack;

public class ArrayStack {
    private double[] array;
    private int top; // Index of the top element in the stack

    // Constructor to initialize the stack with an array
    public ArrayStack(double[] initialArray) {
        array = new double[initialArray.length];
        System.arraycopy(initialArray, 0, array, 0, initialArray.length);
        top = initialArray.length - 1; // Stack is initially full
    }

    // Push operation: Add an element to the top of the stack
    public void push(double value) {
        if (top == array.length - 1) {
            // Stack is full, cannot push more elements
            System.out.println("Stack Overflow");
            return;
        }
        array[++top] = value;
    }

    // Pop operation: Remove and return the top element from the stack
    public double pop() {
        if (isEmpty()) {
            // Stack is empty, nothing to pop
            System.out.println("Stack Underflow");
            return Double.NaN; // Return NaN to signify an error
        }
        return array[top--];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Get the top element of the stack without removing it
    public double peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Double.NaN; // Return NaN to signify an error
        }
        return array[top];
    }

    // Get the size of the stack
    public int size() {
        return top + 1;
    }
}
