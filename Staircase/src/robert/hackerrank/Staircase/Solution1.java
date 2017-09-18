package robert.hackerrank.Staircase;

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int stairs = 1;
        if (n > 0) {
            if (n > 1) {
                for (int j = 0; j < n; j++) {
                    String s = "";
                    for (int i = 0; i < n; i++) {
                        if (i + stairs < n)
                            s += " ";
                        else if (i < n)
                            s += "#";
                    }
                    System.out.println(s);
                    stairs++;
                }
            } else {
                System.out.println("#");
            }
        }
    }
}