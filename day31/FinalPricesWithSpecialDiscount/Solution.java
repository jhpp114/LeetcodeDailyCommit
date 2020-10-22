import java.util.*;
class Solution {
    public int[] finalPrices(int[] prices) {
        int solution[] = new int[prices.length];
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    solution[i] = prices[i] - prices[j];
                    break;
                }
                solution[i] = prices[i];
            }
        }
        solution[prices.length - 1] = prices[prices.length - 1];
        return solution;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int prices1[] = {8,4,6,2,3};
        int answer[] = sol.finalPrices(prices1);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
        System.out.println();
        int prices2[] = {1,2,3,4,5};
        int answer2[] = sol.finalPrices(prices2);
        for (int i = 0; i < answer2.length; i++) {
            System.out.print(answer2[i] + " ");
        }
     
        System.out.println();
        int prices3[] = {10,1,1,6};
        int answer3[] = sol.finalPrices(prices3);
        for (int i = 0; i < answer3.length; i++) {
            System.out.print(answer3[i] + " ");
        }
    }
}