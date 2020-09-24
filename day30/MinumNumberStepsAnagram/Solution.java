import java.util.*;
class Solution {
    public int minSteps(String s, String t) {
        int count[] = new int[26];
        int sum = 0;
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        
        for (char ch : t.toCharArray()) {
            count[ch - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                sum += count[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "bab";
        String t1 = "aba";
        int ans1 = sol.minSteps(s1, t1);
        System.out.println(ans1);

        String s2 = "leetcode";
        String t2 = "practice";
        int ans2 = sol.minSteps(s2, t2);
        System.out.println(ans2);
    }
}