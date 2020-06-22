class Solution {
    public int[] runningSum(int[] nums) {
        int solution[] = new int[nums.length];
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp += nums[i];
            solution[i] = temp;
        } 
        return solution;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = {1,2,3,4};
        int[] sol1 = sol.runningSum(arr1);
        for (int i = 0; i < sol1.length; i++) {
            System.out.print(sol1[i] + " ");
        }
        System.out.println();
    }
}