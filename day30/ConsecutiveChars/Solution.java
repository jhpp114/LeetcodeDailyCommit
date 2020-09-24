import java.util.*;
class Solution {
    public int maxPower(String s) {
        int sum = 0;
        int count = 0;
        ArrayList<Integer> counts = new ArrayList<>();
        char charArray[] = s.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            char ch = charArray[i];
            if (ch == charArray[i+1]) {
                count++;
                counts.add(count);
            } else {
                counts.add(count);
                count =0;
            }
        }
        // System.out.println(counts);
        count = getMax(counts);
        // System.out.println(count);
        return count;
    }
    private int getMax(ArrayList<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max + 1;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "leetcode";
        int ans1 = sol.maxPower(s1);
        System.out.println(ans1);

        String s2 = "abbcccddddeeeeedcba";
        int ans2 = sol.maxPower(s2);
        System.out.println(ans2);

        String s3 = "triplepillooooow";
        int ans3 = sol.maxPower(s3);
        System.out.println(ans3);

        String s4 = "hooraaaaaaaaaaay";
        int ans4 = sol.maxPower(s4);
        System.out.println(ans4);

        String s5 = "tourist";
        int ans5 = sol.maxPower(s5);
        System.out.println(ans5);

        String s6 = "t";
        int ans6 = sol.maxPower(s6);
        System.out.println(ans6);

        String s7 = "cc";
        int ans7 = sol.maxPower(s7);
        System.out.println(ans7);

        String s8 = "ccc";
        int ans8 = sol.maxPower(s8);
        System.out.println(ans8);
    }
}