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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        inorder(root1, result1);
        inorder(root2, result2);
        return mergeSort(result1, result2);
        
    }
    public void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    private List<Integer> mergeSort(List<Integer> l1, List<Integer> l2) {
        List<Integer> list = new ArrayList<>();
        int l1Size = l1.size();
        int l2Size = l2.size();
        int i = 0, j = 0;
        while (l1Size > i && l2Size > j) {
            if (l1.get(i) < l2.get(j)) {
                list.add(l1.get(i));
                i++;
            } else {
                list.add(l2.get(j));
                j++;
            }
        }
        while(l1Size > i) {
            list.add(l1.get(i));
            i++;
        }
        while(l2Size > j) {
            list.add(l2.get(j));
            j++;
        }
        return list;
    } 
}