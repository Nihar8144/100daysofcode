class player{
    int playerid;
    String playername;
    String playergame;
    
    public void printdetails(){
        System.out.println("Player id is " +playerid);
        System.out.println("Player name is " +playername);
        System.out.println("Player game is " +playergame);
    }
}
public class Custom_class {
    public static void main(String[] args) {
        player Ashutosh = new player();
        player Amit = new player();

        Ashutosh.playerid = 01;
        Ashutosh.playername = "Ashutosh Tripathy";
        Ashutosh.playergame = "Football";

        Amit.playerid = 07;
        Amit.playername = "Amit Kispotta";
        Amit.playergame = "Kabaddi";

        Ashutosh.printdetails();
        Amit.printdetails();
    }
}
