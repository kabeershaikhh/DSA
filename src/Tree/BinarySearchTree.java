package Tree;

public class BinarySearchTree {
    static class Node{
        int data;
        Node leftNode, rightNode;

        public Node(int data){
            this.data = data;
            leftNode=rightNode=null;
        }
    }

    Node root;
    private int size;

    public BinarySearchTree(){
        root=null;
        size=0;
    }

    public void addNode(int arr){
        Node newNode=new Node(arr); 
        if(size==0){
            root=newNode;
            size++;
            return;
        }
        Node tempNode=root;
        while(true){
            if(arr<tempNode.data){
                if(tempNode.leftNode==null){
                    tempNode.leftNode=newNode;
                    size++;
                    return;
                }
                tempNode=tempNode.leftNode;
            }
            else if(arr>tempNode.data){
                if(tempNode.rightNode==null){
                    tempNode.rightNode=newNode;
                    size++;
                    return;
                }
                tempNode=tempNode.rightNode;
            }
        }
    }
    
        public void insert(int key) {
            root = insertRec(root, key);
        }
    
        private Node insertRec(Node root, int key) {
            if (root==null) {
                root = new Node(key);
                size++;
                return root;
            }
    
            if (key < root.data)
                root.leftNode = insertRec(root.leftNode, key);
            else if (key > root.data)
                root.rightNode = insertRec(root.rightNode, key);
    
            return root;
        }
    
        public void delete(int key) {
            root = deleteRec(root, key);
        }
    
        private Node deleteRec(Node root, int key) {
            if (root==null)
                return root;
    
            if (key<root.data)
                root.leftNode=deleteRec(root.leftNode, key);
            else if (key > root.data)
                root.rightNode=deleteRec(root.rightNode, key);
    
            else {
                if (root.leftNode==null)
                    return root.rightNode;
                else if (root.rightNode==null)
                    return root.leftNode;
    
                root.data = minValue(root.rightNode);
    
    
                root.rightNode = deleteRec(root.rightNode, root.data);
            }
    
            return root;
        }
    
        private int minValue(Node root) {
            int minValue = root.data;
            while (root.leftNode != null) {
                minValue = root.leftNode.data;
                root = root.leftNode;
            }
            return minValue;
        }
    
        public boolean search(int key) {
            return searchRec(root, key);
        }
    
        private boolean searchRec(Node root, int key) {
            if (root == null || root.data == key)
                return root != null;
    
            if (root.data < key)
                return searchRec(root.rightNode, key);
    
            return searchRec(root.leftNode, key);
        }
    
    

    public void preOrderTraverse(Node node){
        if(node == null)
        return;
        else{
            System.out.print(" "+node.data);
            preOrderTraverse(node.leftNode);
            preOrderTraverse(node.rightNode);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,8,22,3,7,5,12,10,9,20,35,40,42};
        BinarySearchTree tree = new BinarySearchTree();
        for(int i = 0 ; i<arr.length ; i++){
            tree.addNode(arr[i]);
        }
       System.out.print("\nPreorder Traversal: ");
       tree.preOrderTraverse(tree.root);
    }
}
