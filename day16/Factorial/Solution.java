// 디씨인사이드 질문
// 재귀 함수 recursive
// single param

class Solution {

    public double factorial(double n) {
        if (n == 1) {
            // 1/2
            return (n / (n + 1)); 
        }
        return (n / (n + 1)) + factorial(n - 1);
    }
    //2.71666666667
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 4;
        double sol1 = sol.factorial(n);
        System.out.println(sol1);
    }
}
// finish.