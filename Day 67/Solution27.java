/*Sample Input:
    A tale of two cities
Sample Output:
    The title is: A tale of two cities
*/

import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}

class MyBook extends Book{
    void setTitle(String s){
        title = s;
    }
}

public class Solution27{	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}
