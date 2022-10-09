public class varargs {
    public static int sum(int ...arr){
        int result = 0;
        for(int element:arr){
        result +=element; 
    }
    return result;
}
    public static void main(String[] args) {
        System.out.println("The sum of a and b is :" + sum(2,54));
        System.out.println("The sum of a,b and c is :" + sum(2,4,6,9));
        System.out.println("The sum of a,b,c,d,and e is :"+ sum(1,2,3,4,5));
    }
}