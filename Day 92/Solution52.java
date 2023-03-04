/*Sample Input:
    07:05:45PM
Sample Output:
    19:05:45
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution52 {

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        DateFormat inFormat = new SimpleDateFormat( "hh:mm:ssaa");
        DateFormat outFormat = new SimpleDateFormat( "HH:mm:ss");

        Date date = null;
        try {
            date = inFormat.parse(s); 
        }catch (ParseException e ){
            e.printStackTrace();
        }
        if( date != null ){
            String myDate = outFormat.format(date);
            System.out.println(myDate);
        }
    }

}
