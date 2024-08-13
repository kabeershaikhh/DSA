package LinkedList;

 class LL {
    LL(){
        this.size=0;
    }
    Node head;
    private int size;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
           size++;
        }
    }
    void addFirst(int data){
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void addLast(int data){
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void deleteFirst(){
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        size--;
    }

    void deleteLast(){
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next==null) {
            head=null;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null) {
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    int getSize(){
        return size;
    }
    void reverseLL(){
        if (head==null||head.next==null) {
            return;
        }
        Node prevNode=head;
        Node curNode=head.next;
        while (curNode!=null) {
            Node nextNode= curNode.next;
            curNode.next=prevNode;

        //update
        prevNode=curNode;
        curNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    int sum(){
        Node temp=head;
        int sum=0;
        while (temp!=null) {
            sum+=temp.data;
            temp=temp.next;
        }
        return sum; 

    }

    boolean search(int value){
        Node temp=head;
        while (temp!=null) {
            if (temp.data==value) {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    void printList(){
        Node temp=head;
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    LL merge(Node a,Node b){
        LL mergedList=new LL();
        Node mergedHead=new Node(0);//Dummy Node to start merging
        Node temp=mergedHead;
        while (a!=null&& b!=null) {
            if (a.data<b.data) {
                temp.next=a;
                a=a.next;
            }
            else{
                temp.next=b;
                b=b.next;
            }
            temp=temp.next;
        }

          // If one of the lists is not exhausted, append the remaining nodes
          if (a != null) {
            temp.next = a;
        } else {
            temp.next = b;
        }

        mergedList.head=mergedHead.next;
        return mergedList;
    }
    public static void main(String[] args) {
        LL  list1= new LL();
        list1.addFirst(10);
        list1.addLast(20);
        list1.addLast(30);
        list1.addLast(40);
        list1.printList();

        LL  list2= new LL();
        list2.addFirst(5);
        list2.addLast(15);
        list2.addLast(25);
        list2.addLast(35);
        list2.printList();

    //    System.out.println(list.getSize());

       // list1.reverseLL();
        list1.printList();

        System.out.println(list1.sum());
        System.out.println(list1.search(1));

        LL mergedList=list1.merge(list1.head, list2.head);
        mergedList.printList();
       
    }
}
