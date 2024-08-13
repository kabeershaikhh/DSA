package LinkedList;

public class NodeInDe{
    int data;
    NodeInDe next;
    public NodeInDe(int data) {
        this.data = data;
    }
    public NodeInDe(int data, NodeInDe next) {
        this.data = data;
        this.next = next;
    }

    void printL(NodeInDe start){
        for (NodeInDe q=start; q!=null ; q=q.next) {
            System.out.println(q.data);
        }
    }
    NodeInDe insert(NodeInDe start, int x){
        if (start==null||start.data>x) {
            start=new NodeInDe(x, start);
            return start;
        }
        else{
            NodeInDe p=start;
            while (p.next!=null) {
                if (p.next.data>x) {
                    break;
                }
                p=p.next;
            }
            p.next=new NodeInDe(x, p.next);
            return start;
        }
    }
    NodeInDe delete(NodeInDe start, int x){
         if (start==null||start.data>x) {
            return start;
        }
          if (start.data==x) {
            start =start.next;
            return start;
        }
        for (NodeInDe p = start; p.next!=null; p=p.next) {
            if (p.next.data>x) {
                break;
            }
            if (p.next.data==x) {
                p.next=p.next.next;//deletion done!!!
                break;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        NodeInDe start =new NodeInDe(11);
        NodeInDe p=start;
        for (int i = 0; i <4; i++) {
            p.next=new NodeInDe(22+11*i);
            p=p.next;
        }
        start.printL(start);
        
        start.insert(start, 13);
        System.out.println("Updated List: ");
        start.printL(start);

        start.insert(start, 45);
        System.out.println("Updated List: ");
        start.printL(start);

        start.delete(start, 55);
        System.out.println("After deletion: ");
           start.printL(start);

    }
    
}
