import java.util.*;
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder("");
        int acsiiA = 96;
        // int asciiJ = 106;
        int index = 0;
        char stringArray[] = s.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i] == '#') {
                sb.deleteCharAt(index);
            }
            else if (stringArray[i] == '0') {
                continue;
            }
            else {
                char ch = (char)stringArray[i] + 96;
                sb.append(ch);
            }
            index++;
        }
        return sb;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 'a';
        char ab  = 96 + 10;
        System.out.println(a);
        System.out.println(ab);
    }
}