/*Sample Input:
    Hello world
    I am a file
    Read me until end-of-file.
Sample Output:
    1 Hello world
    2 I am a file
    3 Read me until end-of-file.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(sc.hasNext()){
            String s=sc.nextLine();
            System.out.println(i+" "+s);
            i++;
        } 
    }
}
