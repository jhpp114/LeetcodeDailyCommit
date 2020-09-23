import java.util.*;
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int length = A[0].length;
        System.out.println(length);
        int imageArray[][] = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                imageArray[i][j] = A[i][A[i].length - 1 - j];
            }
        }
        for (int i = 0; i < imageArray.length; i++) {
            for (int j = 0; j < imageArray[i].length; j++) {
                System.out.print(imageArray[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < imageArray.length; i++) {
            for (int j = 0; j < imageArray[i].length; j++) {
                if (imageArray[i][j] == 0) {
                    imageArray[i][j] = 1;
                } else {
                    imageArray[i][j] = 0;
                }
            }
        }
        
        return imageArray;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int input1[][] = {
            {1,1,0}
        ,   {1,0,1}
        ,   {0,0,0}
        ,   {1,0,1}
        };
        int ans1[][] = sol.flipAndInvertImage(input1);
        for (int i = 0; i < ans1.length; i++) {
            for (int j = 0; j < ans1[i].length; j++) {
                System.out.print(ans1[i][j]);
            }
            System.out.println();
        }
    }
}