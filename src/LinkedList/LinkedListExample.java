package LinkedList;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListExample {

    public static void main(String[] args) {
        ListNode head = new ListNode(13);
        head.next = new ListNode(14);
        head.next.next = new ListNode(19);
        head.next.next.next = new ListNode(21);


        double average = calculateAverage(head);

        System.out.println("Linked List Values:");
        printList(head);

        System.out.println("Average: " + average);
    }


    private static double calculateAverage(ListNode head) {
        if (head == null) {
            return 0.0;
        }

        int sum = 0;
        int count = 0;

        ListNode current = head;
        while (current != null) {
            sum += current.val;
            count++;
            current = current.next;
        }

        return (double) sum / count;
    }


    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

