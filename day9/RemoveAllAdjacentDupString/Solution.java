import  java.util.*;
class Solution {
    public String removeDuplicates(String S) {
        // odd number = print
        // even number delete
        // ================= PRINT ORDER MATTER SO HASHMAP IS NOT GOOD ===================
        // HashMap<Character, Integer> _hashmap = new HashMap<Character, Integer>();
        // // int frequency = 0;
        // for (int i = 0; i < S.length(); i++) {
        //     if (_hashmap.containsKey(S.charAt(i))) {
        //         _hashmap.put(S.charAt(i), _hashmap.get(S.charAt(i)) + 1);
        //     }
        //     if (!_hashmap.containsKey(S.charAt(i))) {
        //         _hashmap.put(S.charAt(i), 1);
        //     }
        // }
        // String solution = "";
        // for (Map.Entry<Character, Integer> entry : _hashmap.entrySet()) {
        //     if (entry.getValue() % 2 != 0) {
        //         solution += entry.getKey();
        //     }
        // }
        // System.out.println(solution);
        Stack<Character> _stack = new Stack<Character>();
        String solution = "";
        for (int i = 0; i < S.length(); i++) {
            if (_stack.empty()) {
                _stack.push(S.charAt(i));
            } else if (_stack.peek() == S.charAt(i)) {
                _stack.pop();
            } else if (_stack.peek() != S.charAt(i)) {
                _stack.push(S.charAt(i));
            }
        }
        //System.out.println(_stack);
        StringBuilder sb = new StringBuilder();
        while (!_stack.empty()) {
            sb.insert(0, _stack.pop());
        }
        solution = sb.toString();
        return solution;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = "abbaca";
        String sol1 = sol.removeDuplicates(str1);
        System.out.println(sol1);
    }
}