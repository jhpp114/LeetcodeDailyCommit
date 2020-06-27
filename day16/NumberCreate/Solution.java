// 432를 입력하면 4 + 3 + 2 + 432 = 441이 나오게끔

import java.util.*;

class Solution {
    public int number_create(int n) {
        int solution = 0;
        int lastAdd = n;
        if (n == 0) {
            return 0;
        }
        while (n != 0) {
            solution += n % 10;
            n /= 10;
        }
        solution += lastAdd;
        return solution;
    }
    public void prompt() {
        System.out.println("Enter a number to do weird calculation");
        System.out.println("Take only positive integer or 0");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution sol = new Solution();
        sol.prompt();
        int num1 = scanner.nextInt(); 
        //int num1 = 432;
        int solution = sol.number_create(num1);
        System.out.println(solution);
    }
}