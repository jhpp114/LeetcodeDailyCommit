import java.util.*;

class Solution {
    //T_T
    public int minSteps(String s, String t) {
        // to get the frequency
        HashMap<Character, Integer> _hashmap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (_hashmap.containsKey(ch)) {
                _hashmap.put(ch, _hashmap.get(ch) + 1);
            }

            if (!_hashmap.containsKey(ch)) {
                _hashmap.put(ch, 1);
            }
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (_hashmap.containsKey(ch) && _hashmap.get(ch) > 0) {
                // decrese the value to count the item like c in leetcode and practice
                _hashmap.put(ch, _hashmap.get(ch) - 1);
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "leetcode";
        String t1 = "practice";
        int sol1 = sol.minSteps(s1, t1);
        System.out.println(sol1);
        String s2 = "anagram";
        String t2 = "mangaar";
        int sol2 = sol.minSteps(s2, t2);
        System.out.println(sol2);

    }
}