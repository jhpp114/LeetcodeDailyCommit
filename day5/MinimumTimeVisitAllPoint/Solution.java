import  java.lang.*;
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int distance = 0;
        final int x = 0;
        final int y = 1;
        
        for (int i = 0; i < points.length - 1; i++) {
            int xDistance = Math.abs((points[i][x] - points[i+1][x]));
            int yDistance = Math.abs((points[i][y] - points[i+1][y]));
            distance += Math.max(xDistance, yDistance);
        }
        return distance;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int [][]points1 = new int[][]{
            new int[] {1,1}
        ,   new int[] {3,4}
        ,   new int[] {-1,0}
        };
        int distance1 = sol.minTimeToVisitAllPoints(points1);
        System.out.println(distance1);
    }
}