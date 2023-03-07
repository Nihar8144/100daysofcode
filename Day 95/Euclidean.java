/*
Sample Output:
    GCD(10 , 15) = 5
    GCD(35 , 10) = 5
    GCD(31 , 2) = 1
*/

import java.util.*;
import java.lang.*; 
public class Euclidean
{
    // extended Euclidean Algorithm
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
         
        return gcd(b%a, a);
    }
// Driver Program
    public static void main(String[] args)
{
        int a = 10, b = 15, g;
        g = gcd(a, b);
        System.out.println("GCD(" + a +  " , " + b+ ") = " + g);
 
        a = 35; b = 10;
        g = gcd(a, b);
        System.out.println("GCD(" + a +  " , " + b+ ") = " + g);
         
        a = 31; b = 2;
        g = gcd(a, b);
        System.out.println("GCD(" + a +  " , " + b+ ") = " + g);
 
    }
}