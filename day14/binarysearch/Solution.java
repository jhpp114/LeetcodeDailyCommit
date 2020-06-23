class Solution {
    public boolean binarysearch(int arr[], int min, int max, int target) {
        if (max >= min) {
            int middle = (max + min) / 2;
            // same value then found it
            if (arr[middle] == target) {
                return true;
            }
            if (arr[middle] > target) {
                return binarysearch(arr, min, middle - 1, target);
            } else {
                return binarysearch(arr, middle + 1, max, target);
            }
        }
        // cannot find
        return false;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = {1, 3, 4, 5, 13, 20, 25, 30};
        int length = arr.length - 1;
        // start at index 0 max is just length - 1
        boolean isfoundValue = sol.binarysearch(arr, 0, length, 3);
        System.out.println(isfoundValue);    
    }
}