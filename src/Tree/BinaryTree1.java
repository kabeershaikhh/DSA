//Bulid tree from given Pre-order Sequence:
package Tree;

import java.util.*;

public class BinaryTree1 {
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
        //because the null has -1 value
        
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

    // -------------------📌Search Method📌----------------
    public static boolean search(Node root, int value) {
        if (root == null)
            return false;
        if (root.data == value)
            return true;
        return search(root.left, value) || search(root.right, value);
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

    // -------------------📌In-order Traversal📌----------------
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // -------------------📌post-order Traversal📌----------------
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // -------------------📌level-order Traversal📌----------------
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                System.out.println();
                // queue empty
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    // -------------------📌Count Of Nodes📌----------------
    // (X+Y=1) basic formula for counting of nodes
    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = countOfNodes(root.left);
        int rightNode = countOfNodes(root.right);

        return leftNode + rightNode + 1;

    }

    // -------------------📌Sum Of Nodes📌----------------
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    // -------------------📌Height of Tree📌----------------
    // the distance between the root and the deepest leaf.
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // -------------------📌Diameter Of A Tree📌----------------
    // No. of nodes in the longest path between any 2 nodes.
    // Their are 2 cases for the diameter of the tree
    // case1: cross from the root.
    // case2: Do not cross from the root.
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int diam1 = height(root.left) + height(root.right) + 1;
        int diam2 = diameter(root.left);
        int diam3 = diameter(root.right);

        return Math.max(diam1, Math.max(diam2, diam3));
    }

    // -------------------📌Node at kth level📌----------------

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

    // -------------------📌Binary Search📌----------------

    public static Node binarySearchTree(Node root, int key) {
        if (root == null || root.data == key) {
            return root;
        }

        if (key < root.data) {
            return binarySearchTree(root.left, key);
        } else {
            return binarySearchTree(root.right, key);
        }
    }

    // Helper method to print the result
    public static void printSearchResult(Node result, int key) {
        if (result != null) {
            System.out.println("Node with key " + key + " found: " + result.data);
        } else {
            System.out.println("Node with key " + key + " not found.");
        }
    }

    public static void main(String[] args) {
        /*

              1
            /   \
           2     3
          / \    /
          4 5    6  
         
         */
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // System.out.println(root.data);
        System.out.println("1.pre-order:");
        preOrder(root);

        System.out.println();
        System.out.println("2.in-order:");
        inOrder(root);

        System.out.println();
        System.out.println("3.post-order");
        postOrder(root);

        System.out.println();
        System.out.println("4.level-order");
        levelOrder(root);

        System.out.println("5.Count of nodes");
        System.out.println(countOfNodes(root));

        System.out.println("6.Sum of Nodes:");
        System.out.println(sumOfNodes(root));

        System.out.println("7.Height of Tree");
        System.out.println(height(root));

        System.out.println("8.Diameter of the Tree");
        System.out.println(diameter(root));

        int k = 2;
        System.out.println("Nodes at level " + k + ": ");
        KLevel(root, 1, k);
        System.out.println();

    
    }
}
