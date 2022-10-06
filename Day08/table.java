/* Topic: Method
   Question: Print multiplication of a number n using java method */


public class table {
    static void multiplication(int x){
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",x,i,x*i);
        }
    }
    public static void main(String[] args) {
        multiplication(4);
    }
    
}
