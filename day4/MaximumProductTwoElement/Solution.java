import  java.util.*;

class Solution {
    // find two biggest data in array
    public int maxProduct(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        
        return (nums[length-1] -1) * (nums[length-2] -1);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // test 1
        int nums1[] = {3, 4, 5, 2};    
        int sol1 = sol.maxProduct(nums1);
        System.out.println(sol1);
        // test 2
        int nums2[] = {1,5,4,5};
        int sol2 = sol.maxProduct(nums2);
        System.out.println(sol2);
    }
}