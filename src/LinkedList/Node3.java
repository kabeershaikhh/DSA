package LinkedList;

public class Node3 {
    int data;
    Node3 next;

    Node3(int data){
        this.data=data;
    }
    public static void main(String[] args) {
        Node3 head=new Node3(22);
        Node3 temp=head;
        for (int i = 0; i < 4; i++) {
            temp=temp.next= new Node3(33+11*i);
            
        }
        
        for (Node3 n =head; n!=null; n=n.next) {
            System.out.println(n.data+" ");
        }
    }

}
