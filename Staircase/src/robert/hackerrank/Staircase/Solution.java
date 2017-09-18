package robert.hackerrank.Staircase;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int stairs = 1;
        if (n > 0) {
            if (n > 1) {
                for (int j = 0; j < n; j++) {
                    for (int i = 0; i < n; i++) {
                        if (i + stairs < n)
                            System.out.print(" ");
                        else if (i < n - 1)
                            System.out.print("#");
                    }
                    System.out.println("#");
                    stairs++;
                }
            } else {
                System.out.println("#");
            }
        }
    }
}