public class array_sum {
    public static void main(String[] args) {
        float [] arr={1.5f,2.02f,3.8f,4.42f};
        float sum =0;

        for(float element:arr){
            sum += element;
        }
        System.out.println("The Sum is : "+ sum);
    }
}
    