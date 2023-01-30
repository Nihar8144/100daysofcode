/*Sample Input:
    1234
    20
Sample Output:
    1254
    24680
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());
        BigInteger sum = a.add(b);
        BigInteger mul = a.multiply(b);
        System.out.println(sum+"\n"+mul);
    }
}