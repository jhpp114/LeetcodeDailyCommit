import java.util.*;

class Solution {
    public void insertsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            // expecting 5 13 1 2 5 to be insertion sort
            // System.out.println(arr[i]);
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr1[] = {16, 5, 13, 1, 2, 5, 20};
        sol.insertsort(arr1);
        sol.printArray(arr1);
    }
}