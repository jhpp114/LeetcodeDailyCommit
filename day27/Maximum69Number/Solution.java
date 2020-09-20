import java.util.*;
class Solution {
    public int maximum69Number (int num) {
        String stringNumber = String.valueOf(num);
        int sum = 0;
        char digit;
        char stringArray[] = stringNumber.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i] == '6') {
                stringArray[i] = '9';
                break;
            }
        }
        sum = Integer.parseInt(new String(stringArray));
        return sum;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num1 = 9669;
        int sol1 = sol.maximum69Number(num1);
        System.out.println(sol1);
    }
}