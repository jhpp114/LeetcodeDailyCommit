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
    public int traverseRightRootLeft(TreeNode node, int _count) {
        int count = _count;
        if (node == null) {
            return count;
        }
        count = traverseRightRootLeft(node.right, count);
        node.val += count;
        count = node.val;
        count = traverseRightRootLeft(node.left, count);
        return count;
    }
    
    public TreeNode bstToGst(TreeNode root) {
        traverseRightRootLeft(root, 0);
        return root;
    }
}