import java.util.*;

class Solution {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> _hashmap = new HashMap<Character, Integer>();
        char[] jewels = J.toCharArray();
        char[] stones = S.toCharArray();
        int value = 0;
        int count = 0;
        // set up hasmap
        for (int i = 0; i < jewels.length; i++) {
            if ( !_hashmap.containsKey(jewels[i]) ) {
                _hashmap.put(jewels[i], 0);
            } 
        }
        // check exist in hashmap
        for (int i = 0; i < stones.length; i++) {
            if (_hashmap.containsKey(stones[i])) {
                count++;
            } else {
                continue;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        String j1 = "aA";
        String s1 = "aAAbbbb";
        int output1 = sol.numJewelsInStones(j1, s1);
        System.out.println(output1);

        String j2 = "z";
        String s2 = "ZZ";
        int output2 = sol.numJewelsInStones(j2, s2);
        System.out.println(output2);
    }
}