import java.util.*;
public class selectionSort {
    private void Selection_Sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minimum = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minimum] > arr[j]) {
                    minimum = j; // contains minimum index of j
                }
            }
            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
        }
        PrintArray(arr);
    }   

    private static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        } 
    }
    public static void main(String[] args) {
        selectionSort _selectionSort = new selectionSort();
        System.out.println("Hello world");
        int[] arr = {8,2,1,5,4};
        _selectionSort.Selection_Sort(arr);
      
    }
}