package robert.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static final int[][] PATTERN = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
    static final int SIZE = 3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i=0; s_i < 3; s_i++){
            for(int s_j=0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }

        //  Print the minimum cost of converting 's' into a magic square
        int costVal = Integer.MAX_VALUE;

        int[][] ss;
        ss = PATTERN;
        int[][] sss;
        for (int i = 0; i < 4; ++i) {
            sss = reflectionMatrix(ss);
            costVal = costVal > cost(s, ss) ? cost(s, ss) : costVal;
            costVal = costVal > cost(s, sss) ? cost(s, sss) : costVal;
            ss = rotareMatrix(ss);
        }
        System.out.println("" + costVal);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < SIZE; ++i) {
            for (int j = 0; j < SIZE; ++j) {
                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    private static int[][] rotareMatrix(int[][] matrix) {
        int[][] s = new int[SIZE][SIZE];

        s[0][0] = matrix[2][0];
        s[0][1] = matrix[1][0];
        s[0][2] = matrix[0][0];

        s[1][0] = matrix[2][1];
        s[1][1] = matrix[1][1];
        s[1][2] = matrix[0][1];

        s[2][0] = matrix[2][2];
        s[2][1] = matrix[1][2];
        s[2][2] = matrix[0][2];

        return s;
    }

    private static int[][] reflectionMatrix(int[][] matrix) {
        int[][] s = new int[SIZE][SIZE];

        s[0][0] = matrix[2][0];
        s[0][1] = matrix[2][1];
        s[0][2] = matrix[2][2];

        s[1][0] = matrix[1][0];
        s[1][1] = matrix[1][1];
        s[1][2] = matrix[1][2];

        s[2][0] = matrix[0][0];
        s[2][1] = matrix[0][1];
        s[2][2] = matrix[0][2];

        return s;

    }

    private static int cost(int[][] a, int[][] b) {
        int costVal = 0;
        for (int i = 0; i < SIZE; ++i) {
            for (int j = 0; j < SIZE; ++j) {
                costVal += Math.abs(a[i][j] - b[i][j]);
            }
        }
        return costVal;
    }
}
