import java.util.*;
class Solution {
    public int subtractProductAndSum(int n) {
        if (n == 0) {
            return 0;
        }
        int add = 0;
        int multi = 1;
        while (n != 0) {
            add += n % 10;
            multi *= n % 10;
            n /= 10;
        }
        return (multi - add);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n1 = 234;
        int ans1 = sol.subtractProductAndSum(234);
        System.out.println(ans1);

        int n2 = 4421;
        int ans2 = sol.subtractProductAndSum(n2);
        System.out.println(ans2);
    }
}