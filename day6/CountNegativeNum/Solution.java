class Solution {
    public int countNegatives(int[][] grid) {
        int solution = 0;
        int testCase = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < testCase) {
                    solution++;
                }
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // test1
        int[][] grid1 = {
            {4,3,2,-1}
        ,   {3,2,1,-1}
        ,   {1,1,-1,-2}
        ,   {-1,-1,-2,-3}
        };
        int solution1 = sol.countNegatives(grid1);
        System.out.println(solution1);
        // test2
        int[][] grid2 = {
            {3,2}
        ,   {1,0}
        };
        int solution2 = sol.countNegatives(grid2);
        System.out.println(solution2);
    }
}