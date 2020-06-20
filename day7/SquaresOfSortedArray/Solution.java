import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] A) {
        int length = A.length;
        int solution[] = new int[length];
        for (int i = 0; i < length; i++) {
            int val = 0;
            val = A[i] * A[i];
            solution[i] = val;
        }
        Arrays.sort(solution);
        return solution;
    }

    private void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
     
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr1[] = {-4, -1, 0, 3, 10};
        int sol1[] = sol.sortedSquares(arr1);
        sol.PrintArray(sol1);
    }
}