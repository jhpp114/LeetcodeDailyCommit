class Solution {
    public int numIdenticalPairs(int[] nums) {
        int length = nums.length;
        int counter = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int nums1[] = {1,2,3,1,1,3};
        int sol1 = sol.numIdenticalPairs(nums1);
        System.out.println(sol1);

        int nums2[] = {1,1,1,1};
        int sol2 = sol.numIdenticalPairs(nums2);
        System.out.println(sol2);

        int nums3[] = {1,2,3};
        int sol3 = sol.numIdenticalPairs(nums3);
        System.out.println(sol3);

    }
}