package Queue;

class LinkedQueue1{

    Node head=null;
    Node tail=null;
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
        return size==0;
    }
    void insert(int data){
        Node temp=new Node(data);
        if (head==null) {
            head=tail=temp;
            return;
        }

        tail.next=temp;
        tail=temp;
      
    }

    int remove(){
        if (isEmpty()) {
            System.out.println("list is empty!");
            return -1;
        }
        if (head==tail) {
            tail=null;
        }
        Node temp=head;
        head=head.next;
        size--;
        return temp.data;
    }

    int peek(){
        if (isEmpty()) {
            System.out.println("list is empty!");
            return -1;
        }
        return head.data;
    }
    public static void main(String[] args) {
        LinkedQueue1 LL=new LinkedQueue1();
        LL.insert(1);
        LL.insert(2);
        LL.insert(3);
        LL.insert(4);
  

        while (!LL.isEmpty()) {
            System.out.println(LL.remove());
        }
    }
}
