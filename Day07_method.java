//Topic : Method
//Description : Use of Method 


public class method {
    static int num(int x,int y){
        int z;
        if(x>y){
            z=x + y;
        }
        else{
            z = (x + y)*4;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int c;
        c = num(a, b);
        int a1 =4;
        int b1 =6;
        int c1;
        c1=num(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
