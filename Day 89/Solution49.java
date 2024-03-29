/*Sample Input:
    STDIN           Function
    -----           --------
    6               arr[] size n = 6
    -4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]
Sample Output:
    0.500000
    0.333333
    0.166667
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution49 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pos = 0;
        int zero = 0;
        int neg = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (x > 0) {
                pos++;
            } else if (x == 0) {
                zero++;
            } else {
                neg++;
            }
        }
        System.out.println(pos / (double) n);
        System.out.println(neg / (double) n);
        System.out.println(zero / (double) n);
    }
}