class Solution {
    // this is not finding if number is even
    // it is looking for the digit number is even or not
    public int findNumbers(int[] nums) {
        int counter = 0;
        int digit = 0;
        // n^2
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != 0) {
                nums[i] /= 10;
                digit++;
            }
            if (digit % 2 == 0) {
                counter++;
            }
            digit = 0;
        }
        return counter;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // test 1
        int arr1[] = {12, 345, 2, 6, 7896};
        System.out.println(sol.findNumbers(arr1));
        // test 2
        int arr2[] = {555, 901, 482, 1771};
        System.out.println(sol.findNumbers(arr2));
    
    }
}