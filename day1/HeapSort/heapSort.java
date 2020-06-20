public class heapSort{
    private void heap_sort(int arr[]) {
        // length
        int length = arr.length;
        // max heapify
        for (int i = length/2; i >= 0; i--) {
            maxHeapify(arr, length, i);
        }
        for (int i = length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            maxHeapify(arr, i, 0);
        }
    }
    // @param: array, legnth, i
    private void maxHeapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2*i;
        int right = 2*i + 1;

        if (left < n && arr[left] > arr[largest]) {
            largest = left; 
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            // swap
            int temp = arr[i]; 
            arr[i] = arr[largest];
            arr[largest] = temp;

            maxHeapify(arr, n, largest);
        }

    }
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7}; 
        int length = arr.length; 
        heapSort _heapsort = new heapSort();
        _heapsort.heap_sort(arr);
        printArray(arr);
    }
}