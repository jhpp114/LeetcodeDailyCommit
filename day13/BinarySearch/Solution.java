

// 코드몽키 탈출기 자료구조 1
// bst
import java.util.*;

class Solution {
    Node root;
    // add or create bst
    public void addTree(int _value, String _name) {
        Node newNode = new Node(_value, _name);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (_value > current.value) {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                } else {
                    // if value is less than current.value
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
            }
        }
    }
    // inorder traveral 
    // left root right
    public void inorderTraverse(Node root) {
        if (root != null) {
            inorderTraverse(root.left);
            System.out.println(root);
            inorderTraverse(root.right);
        }
    }
    // preorder
    // root left right
    public void preorderTraverse(Node root) {
        if (root != null) {
            System.out.println(root);
            preorderTraverse(root.left);
            preorderTraverse(root.right);
        }
    }
    // postorder
    // left right root
    public void postorderTraverse(Node root) {
        if (root != null) {
            postorderTraverse(root.left);
            postorderTraverse(root.right);
            System.out.println(root);
        }
    }
    // find target
    public Node findNode(int targetValue) {
        if (root == null) {
            return null;
        }
        Node findNode = root;
        while (findNode.value != targetValue) {
            if (targetValue < findNode.value) {
                // search left
                findNode = findNode.left;
            } else {
                // search right
                findNode = findNode.right;
            }
            if (findNode == null) {
                return null;
            }
        }
        return findNode;
    }
    
    public static void main(String[] args) {
        Solution tree = new Solution();
        tree.addTree(50, "50");
        tree.addTree(25, "My Target Delete 25");
        tree.addTree(15, "15");
        tree.addTree(30, "The Target Node");
        // add for testing delete
        tree.addTree(26, "26");
        tree.addTree(75, "75");
        tree.addTree(85, "85");
        tree.inorderTraverse(tree.root);
        System.out.println("================================");
        tree.preorderTraverse(tree.root);
        System.out.println("================================");
        tree.postorderTraverse(tree.root);
        System.out.println("=======Look for 30==============");
        Node foundTree = tree.findNode(30);
        System.out.println(foundTree);
    }
}

class Node {
    int value;
    String name;
    Node left;
    Node right;

    Node(int value, String name) {
        this.value = value;
        this.name = name;
    }
    public String toString() {
        return name + " has value of " + value;
    }
}