/*Sample Input:
    6
Sample Output:
     #
    ##
   ###
  ####
 #####
######
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution50 {

 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        for(int i=1;i<=N;i++) {
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            System.out.print("#");
            
            System.out.println();
            
        }
        
    }

}