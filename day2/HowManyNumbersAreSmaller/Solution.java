import java.util.*;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        int solution[] = new int[length];
        int count = 0;
        // On^2
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            solution[i] = count;
            // reset
            count = 0;
        }
        return solution;
    }

    public int[] smallerNumbersThanCurrent2(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        List<Integer> temp = new ArrayList<>();

        for(int n : nums) temp.add(n);

        Collections.sort(temp);

        for (int i = 0 ; i < len ; i++) {
            result[i] = temp.indexOf(nums[i]);
        }

        return result;
    }

    private void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        // test 1
        int nums1[] = {8,1,2,2,3};
        int output1[] = sol.smallerNumbersThanCurrent(nums1);
        sol.PrintArray(output1);
        // test 2
        int nums2[] = {6,5,4,8};
        int output2[] = sol.smallerNumbersThanCurrent(nums2);
        sol.PrintArray(output2);
        // test 3
        int nums3[] = {7,7,7,7};
        int output3[] = sol.smallerNumbersThanCurrent(nums3);
        sol.PrintArray(output3);
        // test 3_2
        int output3_2[] = sol.smallerNumbersThanCurrent2(nums3);
        sol.PrintArray(output3_2);
    }
}