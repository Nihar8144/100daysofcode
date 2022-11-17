class phone{
    public void switchedOn(){
        System.out.println("Turning On....");
    }
    public void greet(){
        System.out.println("Good Morning");
    }
}

class smartphone extends phone{
    public void greet(){
        System.out.println("Good Evening");
    }
    public void music(){
        System.out.println("Playing music....");
    }
}

public class dynamic_method_dispatch{
    public static void main(String[] args) {
        
        phone obj = new smartphone();
        obj.greet();
        obj.switchedOn();
    }
}