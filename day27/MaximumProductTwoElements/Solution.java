import java.util.*;
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int lastIndex = nums.length -1;
        int secondLastIndex = nums.length - 2;
        int product = (nums[lastIndex] - 1) * (nums[secondLastIndex] - 1);
        return product;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int nums1[] = {3, 4, 5, 2};
        int sol1 = sol.maxProduct(nums1);
        System.out.println(sol1);

        int nums2[] = {1, 5, 4, 5};
        int sol2 = sol.maxProduct(nums2);
        System.out.println(sol2);

        int nums3[] = {3,7};
        int sol3 = sol.maxProduct(nums3);
        System.out.println(sol3);
    }
}