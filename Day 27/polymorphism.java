interface camera{
    void takesnap();
    void recordvideo();
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
public class polymorphism {
    public static void main(String[] args) {
        camera c = new smartphone(); //can use only camera method
        c.takesnap(); 
        c.record4k();
        smartphone sp = new smartphone(); //can use smartphone method
        //c.getnetworks(); -> not allowed
    }
}
