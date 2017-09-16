package robert.hackerrank.climbingtheleaderboard;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for (int scores_i = 0; scores_i < n; scores_i++) {
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for (int alice_i = 0; alice_i < m; alice_i++) {
            alice[alice_i] = in.nextInt();
        }
        // your code goes here
        int[] output = new int[m];
        int[] placeArray = new int[n];
        int scoreIndex = n - 1;
        int aliceIndex = 0;


        for (int i = 0; i < n; i++) {
            if (i == 0) placeArray[i] = 1;
            else {
                if (scores[i] == scores[i - 1]) placeArray[i] = placeArray[i - 1];
                else placeArray[i] = placeArray[i - 1] + 1;
            }
        }

        for (int i = 0; i < m; i++) {
            if (alice[i] <= scores[scoreIndex]) {
                if (alice[i] < scores[scoreIndex]) output[i] = placeArray[scoreIndex] + 1;
                if (alice[i] == scores[scoreIndex]) output[i] = placeArray[scoreIndex];
            } else {
                while (alice[i] > scores[scoreIndex] && scoreIndex > 0) {
                    scoreIndex--;
                    if (alice[i] < scores[scoreIndex]) output[i] = placeArray[scoreIndex] + 1;
                    if (alice[i] == scores[scoreIndex]) output[i] = placeArray[scoreIndex];
                }
            }
            if (scoreIndex == 0 && alice[i] > scores[scoreIndex]) output[i] = 1;
            System.out.println("" + output[i]);
        }
//        System.out.println("" + Arrays.toString(output));
    }
}
