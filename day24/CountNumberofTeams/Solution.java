import java.util.*;
class Solution {
    public int numTeams(int[] rating) {
        int teamCount = 0;
        if (rating.length <= 2) {
            return 0;
        }
        int length = rating.length;
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (rating[i] > rating[j] && rating[j] > rating[k]) {
                        teamCount++;
                    }
                    if (rating[i] < rating[j] && rating[j] < rating[k]) {
                        teamCount++;
                    }
                }
            }
        }
        return teamCount;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int rating1[] = {2, 5, 3, 4, 1};
        int ans1 = sol.numTeams(rating1);
        System.out.println(ans1);

        int rating2[] = {2, 1, 3};
        int ans2 = sol.numTeams(rating2);
        System.out.println(ans2);

        int rating3[] = {1, 2, 3, 4};
        int ans3 = sol.numTeams(rating3);
        System.out.println(ans3);

        int rating4[] = {1, 2};
        int ans4 = sol.numTeams(rating4);
        System.out.println(ans4);
    }
}