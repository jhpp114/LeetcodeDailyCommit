class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] solution = new int[A.length];
        int even = 0;
        int odd = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                solution[even] = A[i];
                even+=2;
            } else {
                solution[odd] = A[i];
                odd += 2;
            }
        }
        return solution;
    }

    private void PrintArray(int arr[]) {
        for (int i  = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr1[] = {4,2,5,7};
        int sol1[] = sol.sortArrayByParityII(arr1);
        sol.PrintArray(sol1);
    }
}