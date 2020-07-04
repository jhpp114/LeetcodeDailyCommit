class Solution {
    public int getSum(int value) {
        int solution = 0;
        if (value <= 0) {
            // error == -1
            return -1;
        }
        for (int i = 1; i <= value; i++) {
            solution += i;
        }
        return solution;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int test1 = 100;
        int output1 = sol.getSum(test1);
        System.out.println(output1);
    }
}