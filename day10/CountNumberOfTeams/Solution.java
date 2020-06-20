class Solution {
    public int numTeams(int[] rating) {
        int length = rating.length;
        int numberOfTeams = 0;
        int checker = 0;
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (rating[i] < rating[j] && rating[j] < rating[k]) {
                        numberOfTeams++;
                    }
                    if (rating[i] > rating[j] && rating[j] > rating[k]) {
                        numberOfTeams++;
                    }
                }
            }
        }
        return numberOfTeams;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int rating1[] = {2,5,3,4,1};
        int team1 = sol.numTeams(rating1);
        System.out.println(team1);

        int rating2[] = {2,1,3};
        int team2 = sol.numTeams(rating2);
        System.out.println(team2);

        int rating3[] = {1,2,3,4};
        int team3 = sol.numTeams(rating3);
        System.out.println(team3);
    }
}