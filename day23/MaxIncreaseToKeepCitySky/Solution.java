class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int maxCol[] = new int[grid.length];
        int maxRow[] = new int[grid[0].length];
        int lengthRow = maxRow.length;
        int lengthCol = maxCol.length;    
        int maxValueRow = 0;
        int maxValueCol = 0;
        for (int i = 0; i < lengthCol; i++) {
            maxValueRow = 0;
            maxValueCol = 0;
            for (int j = 0; j < lengthRow; j++) {
                if (maxValueRow < grid[i][j]) {
                    maxValueRow = grid[i][j];
                }
                if (maxValueCol < grid[j][i]) {
                    maxValueCol = grid[j][i];
                }
            }
            maxRow[i] = maxValueRow;
            maxCol[i] = maxValueCol;
        }
        int min = 0;
        int sum = 0;
        for (int i = 0; i < lengthCol; i++) {
            for (int j = 0; j < lengthRow; j++) {
                min = maxRow[i] > maxCol[j] ? maxCol[j] : maxRow[i];
                sum += min - grid[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int grid[][] = {
            {3, 0, 8, 4}
        ,   {2, 4, 5, 7}
        ,   {9, 2, 6, 3}
        ,   {0, 3, 1, 0}
        };

        int grid2[][] = {
            {3, 0, 8, 4}
        ,   {2, 4, 5, 7}
        ,   {9, 2, 6, 3}
        };
        Solution sol = new Solution();
        int asn = sol.maxIncreaseKeepingSkyline(grid);
        System.out.println(asn);
    }
}