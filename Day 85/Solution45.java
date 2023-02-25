/*Sample Input:
    6
    1 2 3 4 10 11
Sample Output:
    31
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution45 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<num;i++)
            sum+=sc.nextInt();
        System.out.println(sum);
 
    }
}