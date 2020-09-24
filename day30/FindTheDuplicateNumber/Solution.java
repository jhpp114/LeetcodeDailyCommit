import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer>myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (myMap.containsKey(nums[i])) {
                myMap.put(nums[i], myMap.get(nums[i]) + 1);
                return nums[i];
            }   
            myMap.put(nums[i], 1);
        }
        return 0;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int nums1[] = {1,3,4,2,2};
        int sol1 = sol.findDuplicate(nums1);
        System.out.println(sol1);
        int nums2[] = {3,1,3,4,2};
        int sol2 = sol.findDuplicate(nums2);
        System.out.println(sol2);
    }
}