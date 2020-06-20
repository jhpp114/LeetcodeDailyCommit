import java.lang.*;
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        // get maximum in both rows and cols
        int length = grid.length;
        int maxRowValue[] = new int[length];
        int maxColValue[] = new int[length];
        int solution = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (grid[i][j] > maxRowValue[i]) {
                    maxRowValue[i] = grid[i][j];
                }
                if (grid[j][i] > maxColValue[i]) {
                    maxColValue[i] = grid[j][i];
                }
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int min = Math.min(maxRowValue[i], maxColValue[j]);
                solution += min - grid[i][j];
            }
        }
        return solution;

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int building1[][] = {
            {3,0,8,4}
        ,   {2,4,5,7}
        ,   {9,2,6,3}
        ,   {0,3,1,0}
        };
        int sol1 = sol.maxIncreaseKeepingSkyline(building1);
        System.out.println(sol1);
    }
}