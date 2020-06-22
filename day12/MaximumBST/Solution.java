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
    public TreeNode reformatTree(int[] nums, int left, int right) {
        if (nums.length <= right || left < 0 || left > right) {
            return null;
        }
        // obtain max
        int maxIndex = -1;
        int maxValue = -1;
        for (int i = left; i <= right; i++) {
            if (maxValue < nums[i]) {
                maxValue = nums[i];
                maxIndex = i;
            }
        }
        // set up the root
        TreeNode solTree = new TreeNode(nums[maxIndex]);
        solTree.left = reformatTree(nums, left, maxIndex - 1); // exclude max
        solTree.right = reformatTree(nums, maxIndex + 1, right);
        return solTree;
    }
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return reformatTree(nums, 0, nums.length - 1);
        
    }
}