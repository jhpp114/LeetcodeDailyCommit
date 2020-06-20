class Solution {
    public int maximum69Number (int num) {
        String number = Integer.toString(num);
        char[] numberArray = number.toCharArray();
        int length = number.length();
        for (int i = 0; i < length; i++) {
            if (number.charAt(i) == '6') {
                numberArray[i] = '9';
                break;
            }
        }
        int solution = Integer.parseInt(new String(numberArray));
        return solution;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int num1 = 9669;
        int sol1 = sol.maximum69Number(num1);
        System.out.println(sol1);
    }
}