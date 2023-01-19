/*Sample Input:
    100
Sample Output:
    Good job
 */

import java.util.*;
import java.security.*;
public class Solution9 {
 public static void main(String[] args) {

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();

   String s = " ";
   if(n>=-100 && n<=100){
       s = Integer.toString(n);
   }

   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  } catch (Exception e) {
   System.out.println("Unsuccessful Termination!!");
  }
 }
}

