package Tree;


public class AVLTree {
    private int key, height;
    private AVLTree left, right;
    public static final AVLTree NIL = new AVLTree();

    // Constructor
    public AVLTree(int key) {
        this.key = key;
        left = right = NIL;
    }

    // Method to add a key to the tree
    public boolean add(int key) {
        int oldSize = size();
        if (key == this.key) return false; // Prevent key duplication
        if (key < this.key) {
            if (left == NIL) left = new AVLTree(key);
            else left.add(key);
        } else {
            if (right == NIL) right = new AVLTree(key);
            else right.add(key);
        }
        rebalance();
        return size() > oldSize;
    }

    // Method to calculate the size of the tree
    public int size() {
        if (this == NIL) return 0;
        return 1 + left.size() + right.size();
    }

    // Method to perform rebalancing
    private void rebalance() {
        if (right.height > left.height + 1) {
            if (right.left.height > right.right.height)
                right.rotateRight();
            rotateLeft();
        } else if (left.height > right.height + 1) {
            if (left.right.height > left.left.height)
                left.rotateLeft();
            rotateRight();
        }
    }

    // Method to perform left rotation
    private void rotateLeft() {
        AVLTree newLeft = new AVLTree(key);
        newLeft.left = left;
        newLeft.right = right.left;
        key = right.key;
        right = right.right;
        left = newLeft;
    }

    // Method to perform right rotation
    private void rotateRight() {
        AVLTree newRight = new AVLTree(key);
        newRight.right = right;
        newRight.left = left.right;
        key = left.key;
        left = left.left;
        right = newRight;
    }

    // Method to convert the tree to a string
    public String toString() {
        if (this == NIL) return "";
        return left + " " + key + " " + right;
    }

    // Method to grow the tree with a new key
    public AVLTree grow(int key) {
        if (this == NIL) return new AVLTree(key);
        if (key == this.key) return this; // Prevent key duplication
        if (key < this.key) {
            left = left.grow(key);
        } else {
            right = right.grow(key);
        }
        height = 1 + Math.max(left.height, right.height);
        rebalance();
        return this;
    }

    // Private constructor for NIL node
    private AVLTree() {
        left = right = this;
        height = -1;
    }

    // Main method to test the AVLTree
    public static void main(String[] args) {
        AVLTree tree = new AVLTree(50);

        // Using add method to insert keys
        tree.add(30);
        tree.add(70);
        tree.add(20);
        tree.add(40);
        tree.add(60);
        tree.add(80);

        // Using grow method to insert keys
        tree = tree.grow(10);
        tree = tree.grow(90);

        System.out.println("Inorder traversal:");
        System.out.println(tree.toString());
    }
}