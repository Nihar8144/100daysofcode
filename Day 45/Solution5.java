/*Sample Input:
    2
    0 2 10
    5 3 5
Sample Output:
    2 6 14 30 62 126 254 510 1022 2046
    8 14 26 50 98
 */

import java.util.*;
import java.io.*;

class Solution5{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            if( (n>=1 && n<=15) && (a>=0 && a<=50) && (b>=0 && b<=50) ){
                int j=0;
                while(j<n){
                    int s =(int)Math.pow(2, j)*b;
                    sum = sum +s;
                    int ss =sum +a;
                    System.out.print(ss + " ");
                    j++;
                }
                sum = 0;
                int ss = 0;
            }
            System.out.println("");
        }
        in.close();
    }
}
