/*
Given a non-negative integer num, 
return the number of steps to reduce it to zero. 
If the current number is even, you have to divide it by 2, 
otherwise, you have to subtract 1 from it.
*/

import java.util.*;
class Solution {
    public int numberOfSteps (int num) {
        if (num == 0) {
            return 0;
        }
        int step = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
                step++;
            }
            if (num % 2 == 1) {
                num -= 1;
                step++;
            }
        }
        return step;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int answer1 = sol.numberOfSteps(14);
        System.out.println(answer1);
        int answer2 = sol.numberOfSteps(8);
        System.out.println(answer2);
        int answer3 = sol.numberOfSteps(123);
        System.out.println(answer3);
    
    }
}