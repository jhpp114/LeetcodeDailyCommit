import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int length = s.length();
        char ch;
        char peekedItem;
        for (int i = 0; i < length; i++) {
            ch = s.charAt(i);
            if (ch == '(' || ch =='[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' && stack.isEmpty() == false) {
                peekedItem = stack.peek();
                if (peekedItem != '(') {
                    return false;
                }
                stack.pop();
            } else if (ch == ']' && stack.isEmpty() == false) {
                peekedItem = stack.peek();
                if (peekedItem != '[') {
                    return false;
                }
                stack.pop();
            } else if (ch == '}' && stack.isEmpty() == false) {
                peekedItem = stack.peek();
                if (peekedItem != '{') {
                    return false;
                } 
                stack.pop();
            } else {
                return false;
            }
        }        
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "()[]{}";
        boolean sol1 = sol.isValid(s1);
        System.out.println(sol1);

        String s2 = "([)]";
        boolean sol2 = sol.isValid(s2);
        System.out.println(sol2);
    }
}