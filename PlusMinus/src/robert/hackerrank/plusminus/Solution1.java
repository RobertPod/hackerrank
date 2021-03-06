package robert.hackerrank.plusminus;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = in.nextInt();
        }


        int pos = 0;
        int neg = 0;
        int zer = 0;
        for (int i = 0; i < n; i++) {
            if (tab[i] > 0) pos++;
            else if (tab[i] < 0) neg++;
            else zer++;
        }
        myPrint(Float.toString((float) pos / n));
        myPrint(Float.toString((float) neg / n));
        myPrint(Float.toString((float) zer / n));
    }

    static void myPrint(String stringVal) {
        final BigDecimal value = new BigDecimal(stringVal);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(6);
        df.setMinimumFractionDigits(6);
        System.out.println(df.format(value));
    }
}