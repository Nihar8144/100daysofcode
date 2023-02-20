import java.util.*;

public class reminder_theorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of num[]:");
        int numSize = sc.nextInt();
        System.out.println("Enter size of rem[]:");
        int remSize = sc.nextInt();
        int num[] = new int[numSize];
        int rem[] = new int[remSize];
        if(numSize!=remSize){
            System.out.println("Invalid Input");
            return;
        }
        System.out.println("Enter values for the num array:");
        for (int i = 0; i < numSize; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter values for the rem array:");
        for (int i = 0; i < remSize; i++) {
            rem[i] = sc.nextInt();
        }
        int x = 1, k = remSize;
        while (true) {
            int i;
            for (i = 0; i < k; i++) {
                if (x % num[i] != rem[i]) {
                    break;
                }
            }
            if (i == k) {
                System.out.println(x);
                break;
            }
            x++;
        }
        sc.close();
    }
}