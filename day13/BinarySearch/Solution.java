

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
    // delete
    public boolean deleteTreeNode(int deleteNode) {
        Node current = root;
        Node parent = null;
        // search
        boolean isLeft = true;
        // define the location of the target
        while (current.value != deleteNode) {
            parent = current;
            if (deleteNode < current.value) {
                isLeft = true;
                current = current.left;
            } else {
                isLeft = false;
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }
        // if it is leaf
        if (current.left == null && current.right == null) {
            if (current == root) {
                current = null;
            }
            else if (isLeft) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
        // one child
        else if (current.left == null) {
            if (current == root) {
                root = current.right;
            }
            else if (isLeft) {
                parent.left = current.left;
            } else {
                parent.right = current.right;
            }
        }
        // one child
        else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeft) {
                parent.left = current.left;
            } else {
                parent.right = current.right;
            }
        }
        // both children
        // get the replacement
        else {
            Node replaceNode = findMinNode(current);
            if (current == root) {
                root = replaceNode;
            } else if (isLeft) {
                parent.left = replaceNode;
            } else {
                parent.right = replaceNode;
            }
            // to connect the tree
            replaceNode.left = current.left;
        }
        return true;
    }
    public Node findMinNode(Node _node) {
        Node replaceNode = _node;
        System.out.println("Current is: " + replaceNode);
        Node rightNode = _node.right;
        Node finalReplace = _node;
        System.out.println("Current's right is: " + rightNode);
        while (rightNode != null) {
            // get the smallest
            replaceNode = finalReplace;
            finalReplace = rightNode;
            rightNode = rightNode.left;
            System.out.println(finalReplace);
        }
        if (_node.right != finalReplace) {
            replaceNode.left = finalReplace.right;
            finalReplace.right = _node.right; 
        }
        //finalReplace.right = replaceNode.right;
        System.out.println("Smallest: " + finalReplace);
        return finalReplace;
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
        System.out.println("Test Pas=======================");
        // System.out.println("=========Delete Node= 85==========");
        // boolean isDeleted = tree.deleteTreeNode(85);
        // System.out.println("Delete Succeses?: " + isDeleted);
        System.out.println("Test pas=======================");
        // System.out.println("============Delete Node 75 to test One Child");
        // boolean isDeleted = tree.deleteTreeNode(75);
        // System.out.println("Deleted Success?: " + isDeleted);
        System.out.println("============Delete Two child ===============");
        boolean isDeleted = tree.deleteTreeNode(25);
        System.out.println("Deleted Success?: " + isDeleted);
        tree.inorderTraverse(tree.root);
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