import java.util.*;
class Solution {
    public int countNegatives(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            int foundIndex = binarySearch(grid[i], 0, grid[i].length - 1);
            //System.out.println(foundIndex);
            sum += grid[i].length - foundIndex;
        }
        return sum;
    }

    public int binarySearch(int[] grid1, int start, int end) {
        // System.out.println("In");
        while (start <= end) {
            //System.out.println("In");
            int mid = (end + start) / 2;
            if (grid1[mid] >= 0) {
                start = mid + 1;
            } else {
                if (mid - 1 < 0) {
                    return mid;
                }
                if (grid1[mid - 1] >= 0) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            }
        }
        return grid1.length;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int grid1[][] = {
            {4,3,2,-1}
        ,   {3,2,1,-1}
        ,   {1,1,-1,-2}
        ,   {-1,-1,-2,-3}
        };
        int ans1 = sol.countNegatives(grid1);
        System.out.println(ans1);

        int grid2[][] = {
            {-1}
        };
        int ans2 = sol.countNegatives(grid2);
        System.out.println(ans2);

        int grid3[][] = {
            {3,2}
        ,   {1,0}
        };
        int ans3 = sol.countNegatives(grid3);
        System.out.println(ans3);
    }
}