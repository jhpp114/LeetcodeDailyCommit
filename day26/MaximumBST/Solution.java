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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int length = nums.length;
        return bstHelper(nums, 0, length - 1);
    }
    public TreeNode bstHelper(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        if (start == end) {
            return new TreeNode(nums[start]);
        }
        int max = 0;
        int index = -1;
        for (int i = start; i <= end; i++) {
            if (max < nums[i]) {
                index = i;
                max = nums[i];
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = bstHelper(nums, start, index - 1);
        root.right = bstHelper(nums, index + 1, end);
        return root;
    }
    
}