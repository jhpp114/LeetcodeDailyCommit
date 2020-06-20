import java.util.*;
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        boolean solution = true;
        Arrays.sort(target);
        Arrays.sort(arr);

        for (int i = 0; i < target.length; i++) {
            if ((target[i] - arr[i]) != 0) {
                solution = false;
                break;
            }
        }
        return solution;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        // test 1
        int target1[] = {1,2,3,4};
        int arr1[] = {2,4,1,3};
        boolean isEqual1 = sol.canBeEqual(target1, arr1);
        System.out.println(isEqual1);
        // test 2
        int target2[] = {2};
        int arr2[] = {2};
        boolean isEqual2 = sol.canBeEqual(target2, arr2);
        System.out.println(isEqual2);
        // test 3
        int target3[] = {3,7,9};
        int arr3[] = {3,7,11};
        boolean isEqual3 = sol.canBeEqual(target3, arr3);
        System.out.println(isEqual3);
    }
}