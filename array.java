public class array {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5};

        // for loop
         for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
        } 

        //reversing array
        for(int i=number.length-1;i>=0;i--){
            System.out.println(number[i]);
        } 

        //for each loop
        for(int element : number){
            System.out.println(element);
        } 
    }
}
