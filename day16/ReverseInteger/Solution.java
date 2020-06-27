import java.util.*;
class Solution {
    public int reverse(int x) {
        long solution = 0;
        while (x != 0) {
            int modValue = x % 10;
            solution = solution * 10 + modValue;
            // decrease
            x /= 10;
            if (solution > Integer.MAX_VALUE || solution < Integer.MIN_VALUE) {
                return 0;
            }
        }
        // return integer value
        return (int) solution;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int input1 = 123;
        int sol1 = sol.reverse(input1);
        System.out.println(sol1);

        int input2 = -321;
        int sol2 = sol.reverse(input2);
        System.out.println(sol2);

        int input3 = 120;
        int sol3 = sol.reverse(input3);
        System.out.println(sol3);
    }
}