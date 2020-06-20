import java.util.*;
public class insertionSort {
    private void insertion_sort(int[] arr) {
        int len = arr.length;
        for(int i=0;i<len-1;i++) {

            for(int j=i+1;j<len;j++) {

                if(arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
 
        printArr(arr);
    }
    private void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        insertionSort _insertionSort = new insertionSort();
        int arr[] = {8, 2, 1, 5, 4};
        _insertionSort.insertion_sort(arr);
    }
}