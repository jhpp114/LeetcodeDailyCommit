import java.util.*;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNumber = new ArrayList<Integer>();
        int maximum = 0;
        int maxIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (maximum < matrix[i][0]) {
                maxIndex = i;
                maximum = matrix[i][0];
            }
        }
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[maxIndex].length; i++) {
            if (minimum > matrix[maxIndex][i]) {
                minimum = matrix[maxIndex][i];
            }
        }
        luckyNumber.add(minimum);
        return luckyNumber;
    }
    private void returnLength(int[][] arr) {
        System.out.println(arr.length);
    } 
    public static void main(String[] args) {
        Solution sol = new Solution();
        // test 1
        int arr1[][] = {
            {7,8,9}
        ,   {1,2,3}
        };
        List<Integer> solList = sol.luckyNumbers(arr1);
        System.out.println(solList);
        
        // test 2
        int arr2[][] = {
            {56216},
            {63251},
            {75772},
            {1945},
            {27014}
        };
        List<Integer> solList2 = sol.luckyNumbers(arr2);
        System.out.println(solList2);
        

    }

}