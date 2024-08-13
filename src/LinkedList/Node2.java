package LinkedList;

public class Node2 {
    int data;
    Node2 next;
    Node2(int data){
        this. data=data;
    } 
    Node2(int data,Node2 next){
        this.data=data;
        this.next=next;
    }
        Node2(){}
    void Insert(Node2 start,int x){
        Node2 p=start;
        while (p.next!=null) {
            if (p.next.data>x) {
                break;
            }
            p=p.next;
        }
        p.next=new Node2(x,p.next);
    }
    Node2 Insert2(Node2 start,int x){
        if (start==null||start.data>x) {
            start=new Node2(x, start.next);
            return start;
        }
        Node2 p=start;
        while (p.next!=null) {
            if (p.next.data>x) {
                break;
            }
            p=p.next;
        }
        p.next=new Node2(x,p.next);
        return p;
    }
    


    public static void main(String[] args) {
      Node2 start=new Node2();
        start.Insert2(start,2);

        System.out.println(start.data);

    }
}