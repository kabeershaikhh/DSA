//Q2(b)
package LinkedList;

public class Node9 {
    int data;
    Node9 next;

    public Node9(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node9 head;

    // Method to calculate the sum of elements in the linked list
    public int sum(Node9 p) {
        int sum = 0;
        while (p != null) {
            sum += p.data;
            p = p.next;
        }
        return sum;
    }

    // Method to search for a specific value in the linked list
    public boolean search(Node9 p, int a) {
        while (p != null) {
            if (p.data == a) {
                return true;
            }
            p = p.next;
        }
        return false;
    }

    // Method to merge two linked lists
    public LinkedList merge(Node9 p, Node9 q) {
        LinkedList mergedList = new LinkedList();
        Node9 mergedHead = new Node9(0); // Dummy node to start the merged list
        Node9 current = mergedHead;

        while (p != null && q != null) {
            if (p.data < q.data) {
                current.next = p;
                p = p.next;
            } else {
                current.next = q;
                q = q.next;
            }
            current = current.next;
        }

        // If one of the lists is not exhausted, append the remaining nodes
        if (p != null) {
            current.next = p;
        } else {
            current.next = q;
        }

        mergedList.head = mergedHead.next; // Skip the dummy node and set the merged list head
        return mergedList;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.head = new Node9(1);
        list1.head.next = new Node9(3);
        list1.head.next.next = new Node9(5);

        LinkedList list2 = new LinkedList();
        list2.head = new Node9(2);
        list2.head.next = new Node9(4);
        list2.head.next.next = new Node9(6);

        // Example usage of the methods
        System.out.println("Sum of list1: " + list1.sum(list1.head));
        System.out.println("Search in list1 for value 3: " + list1.search(list1.head, 3));

        LinkedList mergedList = list1.merge(list1.head, list2.head);
        System.out.println("Merged List: ");
        Node9 mergedListNode = mergedList.head;
        while (mergedListNode != null) {
            System.out.print(mergedListNode.data + " ");
            mergedListNode = mergedListNode.next;
        }
    }
}
