import java.util.*;

class Solution {
    private int count = 0;
    public int numTilePossibilities(String tiles) {
        if (tiles.length() == 0) {
            return 0;
        }   
        char[] ch = tiles.toCharArray();
        Arrays.sort(ch);
        boolean visited[] = new boolean[ch.length];
        backtracking(ch, visited);
        return count;
    }
    
    public void backtracking(char[] arr, boolean[] isVisit) {
        for (int i = 0; i < arr.length; i++) {
            if (isVisit[i]) {
                continue;
            }
            isVisit[i] = true;
            count++;
            backtracking(arr, isVisit);
            isVisit[i] = false;
            
            while ((i+1 < arr.length) && (arr[i] == arr[i+1])) {
                i++;
            }
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = "AAB";
        int sol1 = sol.numTilePossibilities(str1);
        System.out.println(sol1);
    }
    
}