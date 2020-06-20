import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        // between left and right
        if (root != null && root.val >= L && root.val <= R) {
            sum += root.val;
        } 
        
        if (root.left != null) {
            sum += rangeSumBST(root.left, L, R);
        }
        if (root.right != null) {
            sum += rangeSumBST(root.right, L, R);
        }
        return sum;
    }

    public static void main(String[] args) {
        
    }
}