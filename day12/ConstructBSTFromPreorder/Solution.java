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
    int index = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder == null) {
            return null;
        }
        return bstFromHelper(preorder,Integer.MIN_VALUE ,Integer.MAX_VALUE);
    }
    
    public TreeNode bstFromHelper(int[] preorder, int min, int max) {
        if (preorder.length <= index) {
            return null;
        }
        
        int node = preorder[index];
        TreeNode tree = null;
        if (node > min && node < max) {
            tree = new TreeNode(preorder[index]);
            index++;
            tree.left = bstFromHelper(preorder, min, node);
            tree.right = bstFromHelper(preorder, node, max);
        }
        return tree;
    }
}