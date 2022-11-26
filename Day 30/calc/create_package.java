package calc;

class Calculator{
    public void calculate(double a, double b){
    System.out.println("Your result is: " + a+b);
    }
}
class ScientificCalculator{
    public void calculate(double a, double b){
    System.out.println("Your result is: " + Math.sin(a+b));
    }
}
class HybridCalculator{
    public void calculate(double a, double b){
    System.out.println("Your result is: " + a+b);
    System.out.println("Your result is: " + Math.sin(a+b));
    }
}
public class create_package{
    public static void main(String[] args) {
        System.out.println("Create Package...");
    }
}