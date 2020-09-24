import java.util.*;
class Solution {
    public int numTilePossibilities(String tiles) {
        int count = 0;
        // because A-Z is 26 letters
        int charArray[] = new int[26];
        // get frequency
        for (char ch : tiles.toCharArray()) {
            charArray[ch - 'A']++;
        }
        return countHelper(charArray);
    }
    private int countHelper(int[] charArray) {
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            if (charArray[i] == 0) {
                continue;
            }
            charArray[i]--;
            sum++;
            sum += countHelper(charArray);
            charArray[i]++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String tiles1 = "AAB";
        int ans1 = sol.numTilePossibilities(tiles1);
        System.out.println(ans1);
    }
}