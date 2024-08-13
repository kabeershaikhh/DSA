package Stack;

//stack class
class ArrayStack3{
    int stack_array[];
    int peek,size;
    // constructor -> initialize the array 
    ArrayStack3(int size){
        this.size=size;
        this.stack_array=new int[size];
        this.peek=-1; //peek is negative means stack is empty
    }
    //push method
    void push(int data){
        if(isFull())
            System.out.println("Overflow: stack is full");
        else{
            stack_array[++peek]=data;
            System.out.println("Element push "+data);
        }
    }
    //pop method
    int pop(){
        if(isEmpty()){
            System.out.println("Underflow: stack is empty");
            return -1;
        }
        else{
            int val=stack_array[peek];
            peek--;
            return val;
        }
    }
    //isEmpty method
    boolean isEmpty(){
        return (peek<=0);
    }
    //isFull method
    boolean isFull(){
        return (size-1==peek);
    }
    //search method
    int search(int data){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
            
        else{
            for(int i=0; i<stack_array.length; i++){
                if(stack_array[i]==data){
                    return i;
                }
            }
            return -1;
        }
    }
    int peek(){
        return stack_array[peek];
    }
        public static void main(String[] args){
            //object of stack class 
            ArrayStack3 s=new ArrayStack3(10);
            int[] array1={11,12,13,14,15};
            for(int i : array1){
                s.push(i);
            }
            System.out.println(s.peek());
            System.out.println(s.pop());
            System.out.println(s.search(12));
            System.out.println(s.peek());
    
        }
    }

