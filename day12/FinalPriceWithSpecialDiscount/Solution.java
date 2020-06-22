class Solution {
    public int[] finalPrices(int[] prices) {
        int length = prices.length;
        int discount = 0;
        int sol[] = new int[length];
        for (int i = 0; i < length; i++) {
            discount = 0;
            for (int j = i + 1; j < length; j++) {
                if (prices[i] >= prices[j]) {
                    discount = prices[j];
                    break;
                }
            }
            sol[i] = prices[i] - discount;
        }
        return sol;
    }

    private void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int prices1[] = {8,4,6,2,3};
        int sol1[] = sol.finalPrices(prices1);
        sol.PrintArray(sol1);
    }
}