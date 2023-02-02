/*Sample Input:
    5
    1 -2 4 -5 1
Sample Output:
    9
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution23 {

    public static void main(String[] args) {
        int n,sum=0,c=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                sum = 0;
                for(int k=i;k<=j;k++)
                {
                    sum+=a[k];
                   
                }
                 if(sum<0)c++;
            }
        }
        System.out.print(c);
    }
}  
