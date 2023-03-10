/*
Sample Output:
    10
*/

import java.io.*;
class aliceAppleTree { 
static int minApples(int M,int K,int N,int S,int W,int E){
      if(M <= S * K)
        return M;
      else if(M <= S * K + E + W)
        return S * K + (M-S * K) * K;//(E+W)*K
      else
        return -1;
    }
    public static void main(String[] args){
       int M = 10;

       int K = 15;
 
       int N = 0;
    
       int S = 1;
    
       int W = 0;
    
       int E = 0;
    
       int ans = minApples(M,K,N,S,W,E);
       System.out.println(ans);
    }
}