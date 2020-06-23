import java.util.*;

class Solution {
    public void bubblesort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println("humm");
            }
        }
    }
    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = {15, 13, 2, 11, 6, 5};
        sol.bubblesort(arr);
        sol.printArr(arr);
    }
}