package Stack;

public class ArrayStack1 {
    private int DEFAULT_CAPACITY = 10;
    private int[] array;
    private int size;

    public ArrayStack1() {
        array = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public int getSize() {
        return size;
    }

    public boolean search(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

 
    public void push(int element) {
        if (size == array.length) {
          throw new IllegalArgumentException("Size of stack is full");
        }
        array[size++] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int poppedElement = array[--size];
        System.out.println("Popped Element: " + poppedElement);
        return poppedElement;
    }

   

    public void display() {
        System.out.println("Stack: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
       
        ArrayStack1 stack = new ArrayStack1();

        System.out.println("Pushing 10 values onto the stack:");
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }
     
        System.out.println("Popping elements from the stack:");
        while (!stack.isEmpty()) {
            stack.pop();
        }
    }
}
