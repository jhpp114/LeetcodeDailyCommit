public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int length = nums.length;
        int otherSize = length - n;
        int arr1[] = new int[n];
        int arr2[] = new int[otherSize];
        int finalArr[] = new int[length];
        // store half size of the arr
        for (int i = 0; i < n; i++) {
            arr1[i] = nums[i];
        }
        System.out.println(otherSize);
        // store other half size of arr
        for (int i = otherSize, j = 0; i < length; i++, j++) {
            arr2[j] = nums[i];
        }
        
        // merge it
        int even = 0;
        int odd = 0;
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                finalArr[i] = arr1[even];
                even++;
            } else {
                finalArr[i] = arr2[odd];
                odd++;
            }
        }
        return finalArr;
    }

    public int[] shuffle2(int[] nums, int n) {
        
    }

    private void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        // test 1
        int arr[] = {2,5,1,3,4,7};
        int finalSolution1[] = sol.shuffle(arr, 3);
        sol.PrintArray(finalSolution1);

        // test 2
        int arr2[] = {1,2,3,4,4,3,2,1};
        int finalSolution2[] = sol.shuffle(arr2, 4);
        sol.PrintArray(finalSolution2);
    }
}