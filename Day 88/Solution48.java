/*Sample Input:
    3
    11 2 4
    4 5 6
    10 8 -12
Sample Output:
    15
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution48 {

    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }
        int pd=0,npd=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i)
                    pd=pd+a[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n-j-1){
                    npd=npd+a[i][j];
                }
            }
        }
        int dif=npd-pd;
        dif=Math.abs(dif);
        System.out.println(dif);
    }
}
