public class Solution {
    
    public int numberOfSteps (int num) {
        int step = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                step++;
                num /= 2;
            } else {
                step++;
                num -=1;
            } 
        }
        return step;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int steps = sol.numberOfSteps(8);
        System.out.println(steps);
        steps = sol.numberOfSteps(8);
        System.out.println(steps);
    }
}