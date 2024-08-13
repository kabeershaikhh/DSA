package LinkedList;

 
public class Print_list {
  static  class Node {
     int data;
    Node next;

    Node(int data){
        this.data=data;
    }}
    static void printList(Node head){
           Node temp=head;
      while (temp!=null)  {
            System.out.print(temp.data+" ");
            temp=temp.next;
         }
         System.out.println();
    }

    static void printR(Node head){
        if (head==null) {
            return;
        }
        System.out.print(head.data+" ");
        printR(head.next);
    }

    static int length(Node head){
        int count =0;
        while (head!=null) {
            count++;
            head=head.next;
        }
        return count;
    }

   
    
    
    
    public static void main(String[] args) {
        Node head=new Node(12);
        Node b=new Node(14);
        Node c=new Node(16);
        Node d=new Node(19);
        Node e=new Node(22);
        head.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        
       printList(head);
    //      printR(head);
    //     System.out.println("\n"+length(head));
    //      printList(head);
    //   System.out.println(length(head)); 
    //       printList(head);         
    }}
    
