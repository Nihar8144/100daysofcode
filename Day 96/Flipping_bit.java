/*
Sample Output:
    4
    8
    5
*/

class Flipping_bit{
    static int flipBit(int a){
    if (~a == 0){
        return 8 * sizeof();
    }
    int currLen = 0, prevLen = 0, maxLen = 0;
    while (a != 0){
        if ((a & 1) == 1){
            currLen++;
        } 
        else if ((a & 1) == 0){
            prevLen = (a & 2) == 0 ? 0 : currLen;
            currLen = 0;
        }

        maxLen = Math.max(prevLen + currLen, maxLen);
        a >>= 1;
    }
             
        return maxLen + 1;
    }
    static byte sizeof(){
        byte sizeOfInteger = 8;
        return sizeOfInteger;
    } 
            
    public static void main(String[] args){
        System.out.println(flipBit(13));
        System.out.println(flipBit(1775));
        System.out.println(flipBit(15));
    }
}