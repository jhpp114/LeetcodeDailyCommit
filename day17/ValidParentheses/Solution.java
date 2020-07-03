import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> _stack = new Stack<>();
        char parentheses[] = s.toCharArray();
        for (int i = 0; i < parentheses.length; i++) {
            if (_stack.empty() && (parentheses[i] == ')' || parentheses[i] == ']' || parentheses[i] == '}')) {
                return false;
            }
            if (parentheses[i] == '(' || parentheses[i] == '{' || parentheses[i] == '[') {
                _stack.push(parentheses[i]);
                //System.out.println(_stack);
                // System.out.println("Is Empty: " + _stack.empty());
            } else if (parentheses[i] == ')') {
                if (_stack.peek() == '(') {
                    //System.out.println(_stack.peek());
                    _stack.pop();
                } else {
                    return false;
                }
            } else if (parentheses[i] == '}') {
                if (_stack.peek() == '{') {
                    //System.out.println(_stack.peek());
                    _stack.pop();
                }  else {
                    return false;
                }
            } else if (parentheses[i] == ']') {
                if (_stack.peek() == '[') {
                    //System.out.println(_stack.peek());
                    _stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (_stack.empty()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String input1 = "()";
        boolean output1 = sol.isValid(input1);
        System.out.println(output1);

        String input2 = "()[]{}";
        boolean output2 = sol.isValid(input2);
        System.out.println(output2);

        String input3 = "(]";
        boolean output3 = sol.isValid(input3);
        System.out.println(output3);

        String input4 = "([)]";
        boolean output4 = sol.isValid(input4);
        System.out.println(output4);

        String input5 = "{[]}";
        boolean output5 = sol.isValid(input5);
        System.out.println(output5);
    }
}