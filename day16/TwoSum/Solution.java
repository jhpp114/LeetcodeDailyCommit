import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> _hashmap = new HashMap<>();
        int solution[] = new int[2];
        // store value in hash
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (_hashmap.containsKey(result)) {
                solution[0] = _hashmap.get(result);
                solution[1] = i;
            }
            if (!_hashmap.containsKey(result)) {
                _hashmap.put(nums[i], i);
            }
        }
        
        System.out.println(_hashmap);
        return solution;
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int nums[] = {3,2,4};
        int target = 6;
        int[] sol1 = sol.twoSum(nums, target);
        sol.printArray(sol1);
        System.out.println(-1%10);
    }
}