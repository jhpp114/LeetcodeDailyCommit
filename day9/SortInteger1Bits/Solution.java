import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        // int length = arr.length;
        // // selection sort
        // for (int i = 0; i < length - 1; i++) {
        //     int minimumIndex = i;
        //     for (int j = i + 1; j < length; j++) {
        //         if (bitCounter(arr[minimumIndex]) > bitCounter(arr[j])) {
        //             minimumIndex = j;
        //         }
        //     }
        //     int temp = arr[minimumIndex];
        //     arr[minimumIndex] = arr[i];
        //     arr[i] = temp;
        // }
        // return arr;
        Arrays.sort(arr);
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (bitCounter(arr[j]) > bitCounter(arr[j+1]) ) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    private int bitCounter(int n) {
        int counter = 0;
        while (n != 0) {
            if (n % 2 == 1) {
                counter++;
            }
            n /= 2;
        }
        return counter;
    }

    private void PrintArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr1[] = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        sol.sortByBits(arr1);
        sol.PrintArr(arr1);
    }
}