// Topic : JAVA (Method Overloading)


public class method_overloading {
    static void mov(){
        System.out.println("Hey Bro!");
    }
    static void mov(int a){
        System.out.println("Hey " + a + " Bro!");
    }
    public static void main(String[] args) {
        mov();
        mov(3000);
    }
}
