class Solution {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int result[] = new int[length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                result[i] += nums[j];  
            } 
        }
        return result;
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ' ');
        }   
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int nums1[] = {1,2,3,4};
        int sol1[] = sol.runningSum(nums1);
        // sol.printArray(sol1);

    }
}