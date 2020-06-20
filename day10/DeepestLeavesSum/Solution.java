import javax.swing.tree.TreeNode;


 //* Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
  }

class Solution {
    int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        int maxHeight = findMaxHeight(root);
        AddSum(root, 0, maxHeight);
        return sum;
    }
    // secondly we need to calculate
    public void AddSum(TreeNode root, int currentHeight, int maxHeight) {
        if (root == null) {
            return;
        }
        if (currentHeight == maxHeight) {
            sum+= root.val;
        }
        AddSum(root.left, currentHeight + 1, maxHeight);
        AddSum(root.right, currentHeight + 1, maxHeight);
    }

    // first of all we need to find the maximum deepth
    public int findMaxHeight(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int height1 = findMaxHeight(root.left);
        int height2 = findMaxHeight(root.right);
        return Math.max(height1, height2) + 1;
    }
}