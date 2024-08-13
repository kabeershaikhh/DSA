package Stack;

public class ArrayStack2 {
    int[] arr;
    int MAX_SIZE;
    int size=0;
    ArrayStack2(int MAX_SIZE){
        arr=new int[MAX_SIZE];
        this.MAX_SIZE=MAX_SIZE;
    }
    boolean isEmpty(){
        return size==0;
    }
    boolean isFull(){
        return size==MAX_SIZE;
    }
    void push(int data){
        if (isEmpty()) {
            arr[0]=data;
            size++;
            return;
        }
        arr[size++]=data;
       }
    int pop(){
        if (isEmpty()) {
            System.out.println("list is empty!");
            return -1;
        }
        return arr[--size];
    }
    int peek(){
        if (isEmpty()) {
            System.out.println("list is empty!");
            return -1;
        }
        return arr[size-1];
    }
    void pushAtbottom(int data,ArrayStack2 arrayStack){
        if (arrayStack.isEmpty()) {
            arrayStack.push(data);
            return;
        }
        int top=arrayStack.pop();
        pushAtbottom(data, arrayStack);
        arrayStack.push(top);
    }
    void reverse(ArrayStack2 arrayStack){
        if (arrayStack.isEmpty()) {
            return;
        }
        int top=arrayStack.pop();
        reverse(arrayStack);
        pushAtbottom(top, arrayStack);
    }
    public static void main(String[] args) {
        ArrayStack2 arrayStack=new ArrayStack2(10);
        arrayStack.push(12);
        arrayStack.push(14);
        arrayStack.push(18);
        arrayStack.push(32);

        arrayStack.pushAtbottom(2, arrayStack);
        // System.out.println(arrayStack.peek());
        // System.out.println(arrayStack.pop());
        // System.out.println(arrayStack.size);
        arrayStack.reverse(arrayStack);
        while (!arrayStack.isEmpty()) {
            System.out.println(arrayStack.pop());
        }
    }
}
