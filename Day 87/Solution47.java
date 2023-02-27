/*Sample Input:
    5
    1000000001 1000000002 1000000003 1000000004 1000000005
Sample Output:
    5000000015
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution47 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        long sum = 0;
        while(t-- > 0){
            sum += s.nextInt();
        }
        System.out.println(sum);
    }
}