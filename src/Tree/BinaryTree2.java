package Tree;
public class BinaryTree2 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1; // for travelling on aik aik order of sequence:

        public static Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    // -------------------📌pre-order Traversal📌----------------
        // It is called pre-order because the root comes first.0(n)
        public static void preOrder(Node root) {
            if (root == null) {
                return;// we can also write -1
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
        
    public static void KLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        KLevel(root.left, level + 1, k);
        KLevel(root.right, level + 1, k);
    }

    public static void main(String[] args) {
        /*
              1
            /   \
           2     3
          / \   / \
          4 5   6  7
         
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        preOrder(root);


        // int k=2;
        // KLevel(root,1 , k);
    }
}
