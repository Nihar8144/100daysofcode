import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor");
        int userinput = sc.nextInt();

        Random ra = new Random();
        int computerinput = ra.nextInt(3);

        if(userinput == computerinput){
            System.out.println("Draw");
        }
        else if(userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0 || userinput == 2 && userinput == 1){
            System.out.println("You Win!");
        }
        else{
            System.out.println("Computer Win!");
        }

        if(computerinput == 0){
            System.out.println("Rock");
        }
        else if(computerinput == 1){
            System.out.println("Paper");
        }
        else if(computerinput == 2){
            System.out.println("Scissor");
        }
    }
}
