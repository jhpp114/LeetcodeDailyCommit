// S is the stone I have
// J is guarantee to be distinct
// case sensitive a is different A
import java.util.*;

class Solution {
    public int numJewelsInStones2(String J, String S) {
        HashSet<Character> _set = new HashSet<>();
        if (J.length() <= 0) {
            return 0;
        } 
        for (int i = 0; i < J.length(); i++) {
            _set.add(J.charAt(i));
        }
        int jewelCount = 0;
        for (int i = 0; i < S.length(); i++) {
            if(_set.contains(S.charAt(i))) {
                jewelCount++;
            }
        }
        return jewelCount;
    }

    public int numJewelsInStones(String J, String S) {
        int myStoneLength = S.length();
        int jewelLength = J.length();
        int jewelCount = 0;
        if (jewelLength == 0) {
            return jewelCount;
        }
        //int forLength = myStoneLength > jewelLength ? myStoneLength : jewelLength;
        //System.out.println(forLength);
        for (int i = 0; i < jewelLength; i++) {
            char jew = J.charAt(i);
            for (int j = 0; j < myStoneLength; j++) {
                char stone = S.charAt(j);
                if (jew == stone) {
                    jewelCount++;
                }
            }
        }
        return jewelCount;
    }
    public static void main(String[] args) {
        //System.out.println("hello");
        Solution sol = new Solution();
        String jewel = "a";
        String stone = "Aa";
        int sol1 = sol.numJewelsInStones(jewel, stone);
        System.out.println(sol1);
        int sol2 = sol.numJewelsInStones2(jewel, stone);
        System.out.println(sol2);
    }
}