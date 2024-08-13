package LinkedList;

public class LL3 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this. data=data;
        }
    }
    public static Node deleteSecondLast(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
           
            System.out.println("List doesn't hava a last node.");
            return head;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = current.next.next;

        return head;
    }
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node node1=new Node(15);
      node1.next =new Node(25);
      node1.next.next=new Node(35);
      node1.next.next.next=new Node(55);
      node1.next.next.next.next=new Node(100);

        node1=deleteSecondLast(node1);
        LL3.printList(node1);
    }
}
