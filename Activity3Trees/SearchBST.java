package Activity3Trees;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}

public class SearchBST {

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data < key) {
            return search(root.right, key);
        }

        return search(root.left, key);
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Search 40: " + search(root, 40));
        System.out.println("Search 100: " + search(root, 100));
    }
}