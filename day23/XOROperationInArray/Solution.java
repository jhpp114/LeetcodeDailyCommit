class Solution {
    public int xorOperation(int n, int start) {
        int xorOutput = 0;
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2*i;
        }
        for (int i = 0; i < nums.length; i++) {
            xorOutput ^= nums[i];
        }
        return xorOutput;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans1 = sol.xorOperation(5, 0);
        System.out.println(ans1);

        int ans2 = sol.xorOperation(4, 3);
        System.out.println(ans2);

        int ans3 = sol.xorOperation(1, 7);
        System.out.println(ans3);
    }
}