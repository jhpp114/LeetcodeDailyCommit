import java.util.*;
class Solution {
    public int maxCoins(int[] piles) {
        int sum = 0;
        Deque<Integer> deque = new ArrayDeque<Integer>();
        Arrays.sort(piles);
        for (int i = 0; i < piles.length; i++) {
            deque.offer(piles[i]);
        }
        while (!deque.isEmpty()) {
            deque.removeLast();
            sum += deque.removeLast();
            deque.removeFirst();
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int piles1[] = {2, 4, 1, 2, 7, 8};
        int ans1 = sol.maxCoins(piles1);
        System.out.println(ans1);

        int piles2[] = {2, 4, 5};
        int ans2 = sol.maxCoins(piles2);
        System.out.println(ans2);

        int piles3[] = {9, 8, 7, 6, 5, 1, 2, 3, 4};
        int ans3 = sol.maxCoins(piles3);
        System.out.println(ans3);
    }
}