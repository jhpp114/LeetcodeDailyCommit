import java.util.*;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int solution[] = new int[nums.length];
        if (nums.length == 0) {
            System.out.println("he");
        }
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (nums[i] > nums[j]) {
                    solution[i] += 1;
                }
            }
        }
        return solution;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = {8, 1, 2, 2, 3};
        int[] sol1 = sol.smallerNumbersThanCurrent(arr1);
        
        for (int i = 0; i < sol1.length; i++) {
            System.out.print(sol1[i] + " ");
        }
        System.out.println();
        int[] arr2 = {6,5,4,8};
        int[] sol2 = sol.smallerNumbersThanCurrent(arr2);
        
        for (int i = 0; i < sol2.length; i++) {
            System.out.print(sol2[i] + " ");
        }
        
    }
}