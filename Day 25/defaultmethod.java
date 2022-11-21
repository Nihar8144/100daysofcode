interface camera{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("Hello! Good Morning...");
    }
    default void record4k(){
        System.out.println("Recording 4k video...");
    }
}
interface wifi{
    String[] getnetworks();
    void connecttonetworks(String network);
}
class cellphone{
    void pickcall(){
        System.out.println("Connecting...");
    }
}

class smartphone extends cellphone implements camera,wifi{
    public void takesnap(){
        System.out.println("Taking Snap...");
    }
    public void recordvideo(){
        System.out.println("Recording video...");
    }
    public String[] getnetworks(){
        System.out.println("Getting list of networks:");
        String[] networklist = {"Nihar","Amit","Ashutosh"};
        return networklist;
    }
    public void connecttonetworks(String network){
        System.out.println("Connecting to..."+network);
    }
}
public class defaultmethod {
    public static void main(String[] args) {
        smartphone sp = new smartphone();
        sp.record4k();
    }
}
