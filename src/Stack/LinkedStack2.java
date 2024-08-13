package Stack;

public class LinkedStack2 {
    Node head;
    int size=0;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }

    }
    boolean isEmpty(){
        return head==null;
    }
    void push(int data){
        Node temp=new Node(data);
        if (isEmpty()) {
            head=temp;
            return;
        }
        temp.next=head;
        head=temp;
    }
    int pop (){
        if (isEmpty()) {
            System.out.println("stack is empty!");
            return  -1;
        }
        int ans=head.data;
        head=head.next;
        return ans;
    }
    int peek(){
        if (isEmpty()) {
            System.out.println("stack is empty!");
            return  -1;
        }
        int ans=head.data;
        return ans;
    }
    public static void main(String[] args) {
        LinkedStack2 linkStack=new LinkedStack2();
        linkStack.push(12);
        linkStack.push(14);
        linkStack.push(18);
        linkStack.push(32);

        while (!linkStack.isEmpty()) {
            System.out.println(linkStack.pop());
        }
    }
}
