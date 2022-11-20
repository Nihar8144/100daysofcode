interface Bicycle{
    void applybrake(int decrement);
    void speedup(int increment);
}
class Herocycle implements Bicycle{
    void blowhorn(){
        System.out.println("Horn....");
    }
    public void applybrake(int decrement){
        System.out.println("Decrease Speed...");
    }
    public void speedup(int increment){
        System.out.println("Increase Speed...");
    }
}

public class interfaces {
  public static void main(String[] args) {
    Herocycle obj = new Herocycle();
    obj.blowhorn();
    obj.applybrake(7);
    obj.speedup(5);
  }  
}
