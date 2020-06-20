import java.security.KeyStore.Entry;
import java.util.*;

class Solution {
    public int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> _hashmap = new HashMap<Integer,Integer>();
        int length = A.length;
        
        // get up the keys
        for (int i = 0; i < length; i++) {
            int key = A[i];
            if (_hashmap.containsKey(key)) {
                int counter = _hashmap.get(key);
                counter++;
                _hashmap.put(key, counter);
            } else {
                _hashmap.put(key, 1);
            }
        }
        // return the max value key
        int solutionKey = -1;
        int solutionValue = -1;
        for(Map.Entry<Integer, Integer> it: _hashmap.entrySet()) {
            if (solutionValue < it.getValue()) {
                solutionKey = it.getKey();
                solutionValue = it.getValue();
            }
        }
        return solutionKey;
    }
    
    // print hashmap


    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr1[] = {1,2,3, 3};
        int key1 = sol.repeatedNTimes(arr1);
        System.out.println(key1);
    }
}