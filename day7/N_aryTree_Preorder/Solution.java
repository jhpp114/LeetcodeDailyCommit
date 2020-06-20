class Solution {
    public int hammingDistance(int x, int y) {
        int hammingDistance = 0;
        int lastBit = 1;
        while (x != 0 || y != 0) {
            if ((x & lastBit) != (y & lastBit)) {
                hammingDistance++;
            }
            // shift to right
            x = x >> 1;
            y = y >> 1;

        }
        return hammingDistance;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int x1 = 1;
        int y1 = 4;
        int sol1 = sol.hammingDistance(x1, y1);
        System.out.println(sol1);
    }
}