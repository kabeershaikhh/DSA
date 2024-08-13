package LinkedList;

public class Node_7 {

    int data ;
    Node_7 next;

    public Node_7(int data) {
        this.data = data;
        this.next  = null;
    }
    public Node_7(int data , Node_7 next){
        this.data = data;
        this.next = next;
    }


    public  Node_7 insertAtMiddle(Node_7 start, int value) {
        if (start == null || start.data > value) {
            start = new Node_7( value , start);
            return start;
        }
        Node_7 temp = start;
        while (temp.next != null) {
            if (temp.next.data > value) {
                break;
            }
            temp = temp.next;
        }
        temp.next = new Node_7(value,temp.next);
        return start;
    }

    public void printList(Node_7 head ){
        Node_7 temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }


        public Node_7 subList(Node_7 head ,  int start , int end ){
        Node_7 newNode = new Node_7(-1);
        Node_7 temp1 = head;
        int size =0;
        while(temp1!=null){
            size++;
            temp1 = temp1.next;
        }
        if(start <0 || start >size || end <0 || end>size ){
            System.out.println("Out of Bound");
        }
        else {

            Node_7 temp = head;
            int index = 0;
            while (temp != null && index < start) {
                temp = temp.next;
                index++;
            }
            while (temp != null && index < end) {
              //  System.out.print(temp.data + " ");
                insertAtMiddle(newNode,temp.data);
                temp = temp.next;
                index++;
            }


        }


return newNode.next;

    }
   public int evenSum(Node_7 start){
    Node_7 temp=start;
    int sum=0;
    int position=1;

    while (temp!=null) {
        if (position %2==0) {
            sum +=temp.data;
        }
        temp =temp.next;
        position++;
    }
    return sum;
    }


    public static void main(String[] args) {



        Node_7 n1 = new Node_7(10);
        n1.next=new Node_7(2);
        n1.next.next=new Node_7(4);
        n1.next.next.next=new Node_7(3);
        n1.next.next.next.next=new Node_7(56);
        n1.next.next.next.next.next=new Node_7(5);
      //  Node_7 sublist = n1.subList(n1,1,3);
      //  sublist.printList(sublist);
    System.out.println(n1.evenSum(n1));





    }









}
