/*Sample Input:
    3
    ([A-Z])(.+)
    [AZ[a-z](a-z)
    batcatpat(nat
Sample Output:
    Valid
    Invalid
    Invalid
*/

import java.util.Scanner;
import java.util.regex.*;

public class Solution18{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
             testCases--;
		}
	}
}



