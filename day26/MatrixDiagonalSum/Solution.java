import java.util.*;
class Solution {
    public int diagonalSum(int[][] mat) {
        int rowLength = mat.length;
        int colLength = mat[0].length - 1;
        
        int forEvenNumbe = rowLength / 2;
        if (rowLength == 1) {
            return mat[0][0];
        }
        int sum = 0;
        int j = 0;
        if (mat[0].length % 2 == 0) {
            for (int i = 0; i < mat[0].length; i++) {
                sum += mat[i][j++];
            }
            for (int k = 0; k < mat[0].length; k++) {
                sum += mat[k][colLength--];
            }
        } else {
            for (int i = 0; i < mat[0].length; i++) {
                sum += mat[i][j++];
            }
            for (int k = 0; k < mat[0].length; k++) {
                sum += mat[k][colLength--];
            }
            sum -= mat[forEvenNumbe][forEvenNumbe];
        }
        return sum;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int mat1[][] = {
            {1,2,3,4}
        ,   {5,6,7,8}
        ,   {9,10,11,12}
        ,   {13,14,15,16}
        };
        int ans1 = sol.diagonalSum(mat1);

        int mat2[][] = {
            {1,2,3}
        ,   {5,6,7}
        ,   {9,10,11}
        };
        int ans2 = sol.diagonalSum(mat2);
    }
}