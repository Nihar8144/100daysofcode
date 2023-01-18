/*Sample Input 1:
    1
    3
Sample Output 1:
    3
Sample Input 2:
    -1
    2
Sample Output 2:
    java.lang.Exception: Breadth and height must be positive
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution8 {
    public static int B,H;
    private static boolean flag = false;
    
    static{
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
       if(B>0 && H>0 ){
           flag = true;
       } 
       else{
           System.out.println("java.lang.Exception: Breadth and height must be positive");
       }
    }
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}		
	}
}