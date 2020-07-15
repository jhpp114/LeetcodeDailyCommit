import java.util.*;
import java.lang.*;
class Solution {
    public boolean isPalindrome(int x) {
        boolean isPalidrome = false;
        long xCopy = x;
        if (x <= 0) {
            return isPalidrome;   
        }
        if (x <= 10) {
            return true; 
        }
        ArrayList<Integer> xArray = new ArrayList<Integer>();
        ArrayList<Integer> reverseArray = new ArrayList<Integer>();
        while (x != 0) {
            xArray.add(x % 10);
            reverseArray.add(x % 10);
            x /= 10;
        }
        System.out.println(xArray);
        int power = xArray.size() - 1;
        long totalSum = 0;
        for (int i = 0; i < xArray.size(); i++) {
            totalSum += xArray.get(i) * Math.pow(10, power);
            power--;
        }
        System.out.println(totalSum);
        System.out.println(xCopy);
        if ( (xCopy - totalSum) == 0) {
            isPalidrome = true;
        }
        return isPalidrome;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int x1 = 123;
        boolean sol1 = sol.isPalindrome(x1);
        System.out.println(sol1);

        // int x2 = 121;
        // boolean sol2 = sol.isPalindrome(x2);
        // System.out.println(sol2);

        // int x3 = -121;
        // boolean sol3 = sol.isPalindrome(x3);
        // System.out.println(sol3);

        // int x4 = 1;
        // boolean sol4 = sol.isPalindrome(x4);
        // System.out.println(sol4);

        int x5 = 2147483647;
        boolean sol5 = sol.isPalindrome(x5);
        System.out.println(sol5);
    }
}