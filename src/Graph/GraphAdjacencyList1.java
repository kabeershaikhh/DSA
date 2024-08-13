package Graph;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

public class GraphAdjacencyList1 {
    private LinkedList[] adjacencyList;

    public GraphAdjacencyList1(int vertices) {
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList();
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    public void printAdjacencyList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < adjacencyList.length; i++) {
            System.out.print("Nodes connected to vertex " + i + ": ");
            if (adjacencyList[i].head != null) {
                Node current = adjacencyList[i].head;
                while (current != null) {
                    System.out.print(current.data + " ");
                    current = current.next;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();
        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        
        GraphAdjacencyList graph = new GraphAdjacencyList(vertices);

       
        System.out.println("Enter edges (source vertex, destination vertex):");
        for (int i = 0; i < edges; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            graph.addEdge(source, destination);
        }

        graph.printAdjacencyList();

        scanner.close();
    }
}

