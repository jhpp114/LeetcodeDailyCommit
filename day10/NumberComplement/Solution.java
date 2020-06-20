import java.util.*;

class Solution {
    public int findComplement(int num) {
        String stringSolution = "";
        String convertedBinary = Integer.toBinaryString(num);
        System.out.println("Convert: " + convertedBinary);
        for (int i = 0; i < convertedBinary.length(); i++) {
            if (convertedBinary.charAt(i) == '1') {
                stringSolution += '0';
            } else {
                stringSolution += '1';
            }
        }
        System.out.println(stringSolution);
        int solution = Integer.parseInt(stringSolution,2);
        return solution;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int num1 = 5;
        int sol1 = sol.findComplement(num1);
        System.out.println(sol1);
    }
}