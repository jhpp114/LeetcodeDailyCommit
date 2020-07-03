import java.util.*;

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            else if (nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int input1[] = {1, 3, 5, 6};
        int target = 5;
        int output1 = sol.searchInsert(input1, target);
        System.out.println(output1);

        int input2[] = {1, 3, 5, 6};
        int target2 = 2;
        int output2 = sol.searchInsert(input2, target2);
        System.out.println(output2);
        
        int input3[] = {1, 3, 5, 6};
        int target3 = 7;
        int output3 = sol.searchInsert(input3, target3);
        System.out.println(output3);
    }
}