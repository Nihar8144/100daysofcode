/*
Sample Output:
    phi(1) = 1
    phi(2) = 1
    phi(3) = 2
    phi(4) = 2
    phi(5) = 4
    phi(6) = 2
    phi(7) = 6
    phi(8) = 4
    phi(9) = 6
    phi(10) = 4
*/

class Euler_phi{ 
    // Function to return GCD of a and b 
    static int gcd(int a, int b) { 
        if (a == 0) 
        return b; 
        return gcd(b % a, a); 
    } 
    static int phi(int n) { 
        int result = 1; 
        for (int i = 2; i < n; i++) 
        if (gcd(i, n) == 1) 
        result++; 
        return result; 
    } 
    public static void main(String[] args) { 
        int n; 
        for (n = 1; n <= 10; n++) 
        System.out.println("phi(" + n + ") = " + phi(n)); 
    }
}
