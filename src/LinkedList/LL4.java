package LinkedList;

import java.util.Arrays;

//DSA LAB 5 question 3,4 (LinkedList)
class Node{
    int data;
    Node next;
 
 public Node(int data) {
     this.data = data;
     this.next=null;
 }
 
   public Node(int data, Node next) {
     this.data = data;
     this.next = next;
 }
 }
public class LL4 {
    Node head;
    private Object p;
    
    //Question 3
    //task1
    
    boolean isEmpty(){
        if (head==null) {
            return true;
        }
        return false;
    }
    //task2
    
    int getSize(){
        Node p=head;
        int count=0;
        while (p!=null) {
            count++;
            p=p.next;
        }
        return count;
    }
    //task3
    
    Node insertAtStart(int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        return head;
    }
    //task4
    
    void insertAtEnd(int data){
        Node temp=new Node(data);
        if (head==null) {
            head=temp;
        }
        else{
            Node p=head;
            while (p.next!=null) {
                p=p.next;
            }
            p.next=temp;
        }
    }
    //task5
    public 
     Node insertAtPosition(int data, int position) {
        Node temp=new Node(data);
    
        if (position<0) {
            throw new IllegalStateException("Position cant be less than Zero");
        
        }
         if (position==0) {
            temp.next=head;
            head=temp;
            return head;

        }
        Node current=head;
        int currentPosition=1;
    
        while (currentPosition<position-1 && current != null) {
            current = current.next;
            currentPosition++;
        }
    
        if (current==null) {
            System.out.println("Invalid position");
            return head;
        }
    
        temp.next=current.next;
        current.next=temp;
    
        return head;
    }
    //task6
    
    Node deleteAtFirst(Node head){
        if (head==null) {
            return null;
        }
        //Node temp=head;
        head=head.next;
        // temp.next=null;
        return head;
    }
    //task7
    
    Node deleteAtLast(Node head){
        if (head==null||head.next==null) {
            return null;
        }
        Node temp=head;
        Node previous=null;
        while (temp.next!=null) {
            previous=temp;
            temp=temp.next;
        }
        previous.next=null;
        return head;
    }
    //task8
    public 
     Node deleteAtPosition(int position) {
        if (position<=0) {
            System.out.println("Invalid position");
            return head;
        }
        if (position==1) {
            return deleteAtFirst(head);
        }
        Node current=head;
        Node previous=null;
        int currentPosition = 1;
    
        while (currentPosition<position && current!=null) {
            previous=current;
            current=current.next;
            currentPosition++;
        }
        if (current==null) {
            System.out.println("Invalid position");
            return head;
        }
    
        previous.next = current.next;
        current.next = null;
    
        return head;
    }
    //task9
    
    boolean Search(int data){
        Node temp=head;
        while (temp!=null) {
            if (temp.data==data) {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    //task10
 
    Node deleteWithValue(int value) {
    if (head == null) {
        return null;
    }
    if (head.data==value) {
        return deleteAtFirst(head);
    }

    Node current=head;
    Node previous=null;
    while (current!=null && current.data!=value) {
        previous=current;
        current=current.next;
    }
    if (current==null) {
        return head;
    }
    previous.next=current.next;
    current.next=null;

    return head;
}
    //task11
    
    void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    //Question 4
public 
 int[] linkedListToArray() {
    if (head == null) {
        return new int[0];
    }

    int size = getSize();
    int[] array = new int[size];
    Node current = head;

    for (int i = 0; i < size; i++) {
        array[i] = current.data;
        current = current.next;
    }

    return array;
}
    
    public static void main(String[] args) {
        LL4 list=new LL4();
        list.head=new Node(11);
        list.head.next=new Node(22);
        list.head.next.next=new Node(33);
        list.head.next.next.next=new Node(44);
        list.head.next.next.next.next=new Node(55);
        //task1
        System.out.println("Is Empty? "+list.isEmpty());
        //task2
        System.out.println("Length: "+list.getSize());
        //task3
         list.insertAtStart(4);
        //task4
        list.insertAtEnd(3);

       
       //task5
        list.insertAtPosition(23,4);
       System.out.print("\nElements in LinkedList after putting 13 at 4th position : ");
        list.display();
        //task6
       list.deleteAtFirst(list.head);
       System.out.print("\nElements in LinkedList after deleting first element: ");
       list.display();
       //task7
         list.deleteAtLast(list.head);
        System.out.print("\nElements in LinkedList after deleting  last element: ");
         list.display();
        //task8
        list.deleteAtPosition(5);
        System.out.print("\nElements in LinkedList after deleting at 5th position: ");
        list.display();
        //task9
        System.out.print("\nIs element present? "+list.Search(23));
        //task10
        System.out.print("\nBefore deleting particular value(23): ");
        list.display();

      list.deleteWithValue(23);
        System.out.print("\nAfter deleting particular value(23): ");
        list.display();

        int[] arr=list.linkedListToArray();
        System.out.println("\nIn Array form: "+Arrays.toString(arr));
    }

}
