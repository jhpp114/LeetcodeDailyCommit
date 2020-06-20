class Solution {
    /*
        matrix = [
        [1,2,3,4],
        [5,1,2,3],
        [9,5,1,2]
]
    */
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int  j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[i-1][j-1]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr1[][] = {
            {1,2,3,4}
        ,   {5,1,2,3}
        ,   {9,5,1,2}
        };
        boolean sol1 = sol.isToeplitzMatrix(arr1);
        System.out.println(sol1);

        int arr2[][] = {
            {1, 2}
        ,   {2, 2}
        };
        boolean sol2 = sol.isToeplitzMatrix(arr2);
        System.out.println(sol2);
    }
}