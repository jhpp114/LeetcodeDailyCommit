import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        int length = nums.length;
        int solution[] = new int[2];
        for (int i = 0; i < length; i++) {
           if (myMap.containsKey(target - nums[i])) {
                solution[0] = myMap.get(target-nums[i]);
                solution[1] = i;
                break;
           }
           myMap.put(nums[i], i);
        }
        return solution;
    }

    public void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int nums1[] = {2, 7, 11 ,15};
        int target1 = 9;
        
        int[] solution1 = sol.twoSum(nums1, target1);
        sol.printArr(solution1);
    }
}