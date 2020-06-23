

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
    // delete part
    // case 1. no child (leaf)
    // case 2. one child
    // case 3. have both children
    public boolean removeNode(int value) {
        Node current = root;
        Node parent = null;
        boolean isLeft = true;
        while (current.value != value) {
            parent = current;
            if (current.value > value) {
                // look up left
                isLeft = true;
                current = current.left;
            } else {
                // look up right
                isLeft = false;
                current = current.right;
            }
            // value does not exist
            if (current == null) {
                return false;
            }
        }
        // one child
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeft) {
                // if it is on the left side
                parent.left = null;
            } else {
                // if it is on the right side
                parent.right = null;
            }
        } 
        // one child
        // has right child
        else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeft) {
                parent.left = current.left;
            } else {
                // right
                parent.right = current.right;
            }
        } 
        // take care the other side
        else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeft) {
                parent.left = current.left;
            } else {
                parent.right = current.right;
            }
        }
        // Two child
        else {
            Node minimumNode = getMinimumNode(current);
            if (current == root) {
                root = minimumNode;
            } else if (isLeft) {
                parent.left = minimumNode;
            } else {
                parent.right = minimumNode;
            }
            minimumNode.left = current.left;
        }
        return true;
    }
    public Node getMinimumNode(Node removeNode) {
        Node parentReplaceNode = removeNode;
        Node replaceNode = removeNode;
        Node removeRight = removeNode.right;
        while (removeRight != null) {
            parentReplaceNode = replaceNode;
            replaceNode = removeRight;
            removeRight = removeRight.left;
        }
        if (replaceNode != removeNode.right) {
            parentReplaceNode.left = replaceNode.right;
            replaceNode.right = removeNode.right;
        }
        return replaceNode;
    }
    public static void main(String[] args) {
        Solution tree = new Solution();
        tree.addTree(50, "50");
        tree.addTree(25, "You are my Target 25");
        tree.addTree(15, "15");
        tree.addTree(30, "30");
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
        // System.out.println("============Test No Child===============");
        // System.out.println("============Pass===============");
        // boolean isDeleted = tree.removeNode(85);
        // System.out.println("Deleting Leaf: " + isDeleted);
        // tree.inorderTraverse(tree.root);
        // System.out.println("============Test One Child===============");
        // System.out.println("============Pass===============");
        // boolean isDeleted = tree.removeNode(75);
        // System.out.println("Deleting Leaf: " + isDeleted);
        // tree.inorderTraverse(tree.root);
        // System.out.println("===========Test Two Child=================");
        // System.out.println("Pass")
        // boolean isDeleted = tree.removeNode(25);
        // System.out.println("Deleting two child: " + isDeleted);
        // tree.inorderTraverse(tree.root);
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