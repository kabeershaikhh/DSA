package LinkedList;

public class LL2 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void displayReverse(Node head){
        if (head==null) {
            return;
        }
        displayReverse(head.next);
       System.out.print(head.data+" ");
    }
    public static int length(Node head){
        int count=0;
        while (head!=null) {
            count++;
            head=head.next;

        }
        return count;
    }
    public static void main(String[] args) {
        Node head=new Node(0);
        Node temp=head; 
        for (int i = 1; i < 5; i++) {
          temp.next=new Node(i*4);
          temp=temp.next;

          
        }
        LL2.display(head);
        System.out.println();
        System.out.print("Reverse Form: ");
        LL2.displayReverse(head);   
        System.out.println();

        System.out.println("The Length: "+LL2.length(head));
        
    }
}
