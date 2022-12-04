import java.util.Scanner;
public class nested {
    public static void main(String[] args) {
        int [] marks = {56,86,76};
        Scanner sc = new Scanner(System.in);
        boolean flag  = true;
        while(flag){
            System.out.println("Enter the value of index");
            int i = sc.nextInt();
            try {
                System.out.println("Welcome");
                try {
                    System.out.println(marks[i]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exceptio in  Level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in Level 1");
            }
        }
        System.out.println("Thank you");
    }
}
