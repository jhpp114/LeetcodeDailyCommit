class Solution {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int solution[] = new int[length];
        int lengthSolutoin = solution.length;
        System.out.println(lengthSolutoin);
        int maximum = 0;
        for (int i = 0; i < length; i++) {
            maximum = 0;
            for (int j = i + 1; j < length; j++) {
                if (maximum < arr[j]) {
                    maximum = arr[j];
                }
            }
            System.out.println("Maximum: " + maximum);
            solution[i] = maximum;
        }
        solution[length - 1] = -1;
        return solution;
    }

    private void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        // test 1
        int arr1[] = {17,18,5,4,6,1};
        int sol1[] = sol.replaceElements(arr1);
        sol.PrintArray(sol1);
       

    }
}