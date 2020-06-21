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
    List<Integer> answer = new ArrayList<Integer>();
    public void traversePreorder(TreeNode node) {
        if (node != null) {
            answer.add(node.val);
            traversePreorder(node.left);
            traversePreorder(node.right);
        }
    }
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        traversePreorder(root1);
        traversePreorder(root2);
        Collections.sort(answer);
        return answer;
    }
    
}