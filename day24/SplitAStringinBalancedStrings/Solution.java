class Solution {
    public int balancedStringSplit(String s) {
        int isBalance = 0;
        int balanceCount = 0;
        if (s.length() == 0) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                isBalance--;
            } else {
                isBalance++;
            }
            if (isBalance == 0) {
                balanceCount++;
            }
        }
        return balanceCount;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "RLRRLLRLRL";
        int ans1 = sol.balancedStringSplit(s1);
        System.out.println(ans1);

        String s2 = "RLLLLRRRLR";
        int ans2 = sol.balancedStringSplit(s2);
        System.out.println(ans2);
    }
}