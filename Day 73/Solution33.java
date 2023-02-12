/*Sample Input1:
    10
    3
Sample Output1:
    3
Sample Input2:
    10
    Hello
Sample Output2:
    java.util.InputMismatchException
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution33 {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
           
            int b = sc.nextInt();
          
            int c = a/b;
            System.out.print(c);
        }
        catch(InputMismatchException ob){
            System.out.print("java.util.InputMismatchException");
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}
