class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int numberOfStudents = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime) {
                if (endTime[i] >= queryTime) {
                    numberOfStudents++;
                }
            }
        }
        return numberOfStudents;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int st1[] = {9,8,7,6,5,4,3,2,1};
        int et1[] = {10,10,10,10,10,10,10,10,10};
        int qt1 = 5;
        int ans1 = sol.busyStudent(st1, et1, qt1);
        System.out.println(ans1);

        int st2[] = {1,1,1,1};
        int et2[] = {1,3,2,4};
        int qt2 = 0;
        int ans2 = sol.busyStudent(st2, et2, qt2);
        System.out.println(ans2);
    }
}