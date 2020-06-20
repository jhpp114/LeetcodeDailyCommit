import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        boolean isUnique = true;
        int length = arr.length;
        
        HashMap<Integer, Integer> _hashmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < length; i++) {
            
            if (_hashmap.containsKey(arr[i])) {
                _hashmap.put(arr[i], _hashmap.get(arr[i]) + 1);
              
            }
            if (!_hashmap.containsKey(arr[i])) {
                _hashmap.put(arr[i], 1);
            }
        }
        Set<Object> uniqueValue = new HashSet<Object>(_hashmap.values());
        if (uniqueValue.size() != _hashmap.size()) {
            isUnique = false;
        }
        return isUnique;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        // test 1
        int arr1[] = {1, 2, 2, 1, 1, 3};
        boolean sol1 = sol.uniqueOccurrences(arr1);
        System.out.println(sol1);
        // test 2
        int arr2[] = {1, 2};
        boolean sol2  = sol.uniqueOccurrences(arr2);
        System.out.println(sol2);
    }
}