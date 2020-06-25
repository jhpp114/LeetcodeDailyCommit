import java.util.*;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (isMatchPattern(words[i], pattern)) {
                answer.add(words[i]);
            }
        }
        System.out.println(answer);
        return answer;
    }

    public boolean isMatchPattern(String words, String pattern) {
        //boolean isMatch = true;
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < words.length(); i++) {
            char wordChar = words.charAt(i);
            char patternChar = pattern.charAt(i);
            if (!map1.containsKey(wordChar)) {
                map1.put(wordChar, patternChar);
            }
            if (!map2.containsKey(patternChar)) {
                map2.put(patternChar, wordChar);
            }
            if (map1.get(wordChar) != patternChar || map2.get(patternChar) != wordChar) {
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";
        List<String>sol1 =  sol.findAndReplacePattern(words, pattern);
        System.out.println(sol1);

    }

}