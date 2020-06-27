class Solution {
    public void Permutation(int[] nums) {
        int lenght = nums.length;
        PermutationHelper(nums,lenght, 0);
    }
    public void mySwap(int num[], int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    public void PermutationHelper(int[] nums, int length, int begin) {
        if (begin == length) {
            printArray(nums, length);
            return;
        }
        for (int i = begin; i < length; i++) {
            mySwap(nums, i, begin);
            PermutationHelper(nums, length, begin + 1);
            mySwap(nums, begin, i);
        }
    }
    public void printArray(int num[], int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(num[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = {1,2,3};
        sol.Permutation(arr);
    }
}