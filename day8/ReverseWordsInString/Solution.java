import java.util.*;

class Solution {
    public String reverseWords(String s) {
        // solution 1
        // String splitArr[] = s.split(" ");
        // String solution = "";
        // for (int i = 0; i < splitArr.length; i++) {
        //     String temp = splitArr[i];
        //     for (int j = temp.length() - 1; j >= 0; j--) {
        //         solution += temp.charAt(j);
        //     }
        //     solution += " ";
        // }
        // solution = solution.trim();
        // return solution;

        // solution 2
        StringBuilder sb = new StringBuilder();
        StringBuilder solution = new StringBuilder();
        for(String ss: s.split(" ")) {
            sb.append(ss);
            sb.reverse();
            solution.append(sb.toString() + " ");
            sb.setLength(0);
        }
        return solution.toString().trim();
    }

    private void PrintArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "/");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "Let's take LeetCode contest";
        String sol1 = sol.reverseWords(s1);
    }
}