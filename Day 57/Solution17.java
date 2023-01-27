/*Sample Input:
    He is a very very good boy, isn't he?
Sample Output:
    10
    He
    is
    a
    very
    very
    good
    boy
    isn
    t
    he
*/

import java.io.*;
import java.util.*;

public class Solution17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if(s.length() == 0){
            System.out.println(0);
        }else{
            String[] strings = s.split("['!?,._@ ]+");
            System.out.println(strings.length);
            for(String str : strings)
            System.out.println(str);
        }
        scan.close();
    }
}

