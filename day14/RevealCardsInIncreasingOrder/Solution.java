import java.util.*;

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int length = deck.length;
        Arrays.sort(deck);
        Queue<Integer> solutionQueue = new LinkedList<>();
        for (int i = length - 1; i >= 0; i--) {
            solutionQueue.add(deck[i]);
        }
        // ok
        //System.out.println(solutionQeueu);
        int[] solution = new int[length];
        // 17 13 11 7 6 3 2
        int temp1 = 0;
        int temp2 = 0;
        LinkedList<Integer> _tempList = new LinkedList<>();
        while (!solutionQueue.isEmpty()) {
            //13, 17 
            temp1 = solutionQueue.poll();
            // first value
            if (_tempList.size() == 0) {
                _tempList.addFirst(temp1);
                System.out.println("Initial: " + _tempList);
            } else {
                // 13 17 = > 17
                temp2 = _tempList.removeLast();

                // 17 13
                _tempList.addFirst(temp2);
                // 11 17 13
                _tempList.addFirst(temp1);
            }
        }
        Object[] convertToArraay = _tempList.toArray();
        for (int i = 0; i < length; i++) {
            solution[i] = (Integer)convertToArraay[i];
        }
        return solution;
    }
    public void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = {17, 13, 11, 2, 3, 5, 7};
        int sol1[] = sol.deckRevealedIncreasing(arr);
        sol.printarray(sol1);
    }
}