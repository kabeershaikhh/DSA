package LinkedList;
public class Node5 {
    private int data;
    private Node next;

    Node5(int data){
        this.data=data;
    }
    public static void main(String[] args) {
        Node start =new Node(10);
             start.next=new Node(20);
             start.next.next=new Node(30);
             start.next.next.next=new Node(40);
               
         System.out.println(start.data);
         System.out.println(start.next.data);
         System.out.println(start.next.next.data);
         System.out.println(start.next.next.next.data);
         System.out.println(start.next.next.next.next.data);

    }
}
