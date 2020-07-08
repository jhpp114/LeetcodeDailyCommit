import java.util.*;

class Solution {
    public int getMultipleThree() {
        int solution = 0;
        ArrayList<Integer> solutionArr = new ArrayList<Integer>();
        for (int i = 0; i <= 35; i++) {
            if (i % 3 == 0) {
                if (i == 0){
                    continue;
                }
                solutionArr.add(i);
                solution++;
            }
        }
        System.out.println(solutionArr);
        return solution;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int sol1 = sol.getMultipleThree();
        System.out.println(sol1);
    }
}