class Solution {
    // constrain (startTime and endTime length are same)
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int studentCounter = 0;
        int length = startTime.length;
        for (int i = 0; i < length; i++) {
            if (startTime[i] <= queryTime) {
                if (endTime[i] >= queryTime) {
                    studentCounter++;
                }
            }
        }
        return studentCounter;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // test 1
        int startTime1[] = {1,2,3};
        int endTime1[] = {3,2,7};
        int queryTime1 = 4;
        int busyNumber1 = sol.busyStudent(startTime1, endTime1, queryTime1);
        System.out.println(busyNumber1);
        
        // test2
        int startTime2[] = {9,8,7,6,5,4,3,2,1};
        int endTime2[] = {10,10,10,10,10,10,10,10,10};
        int queryTime2 = 5;
        int busyNumber2 = sol.busyStudent(startTime2, endTime2, queryTime2);
        System.out.println(busyNumber2);

        // test 3
        int startTime3[] = {1,1,1,1};
        int endTime3[] = {1,3,2,4};
        int queryTime3 = 7;
        int busyNumber3 = sol.busyStudent(startTime3, endTime3, queryTime3);
        System.out.println(busyNumber3);
    }
}
