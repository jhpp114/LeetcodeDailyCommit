import java.util.*;
class Solution {
    public int subtractProductAndSum(int n) {
        List<Integer>digits = new ArrayList<Integer>();
        while (n != 0) {
            digits.add(n%10);
            n /= 10;
        } 
        
        int multiply = 1;
        int addition = 0;
        int solution = 0;

        for (int i = 0; i < digits.size(); i++) {
            multiply *= digits.get(i);
        }

        for (int i = 0; i < digits.size(); i++) {
            addition += digits.get(i);
        }

        solution = multiply - addition;
        return solution;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int n = sol.subtractProductAndSum(4421);
        System.out.println(n);
    }
}