class triangle{
    triangle(){
        System.out.println("This is constructor 1");
    }
    triangle(int a){
        System.out.println("The area of the triangle is : " +a);
    }
}
    class square extends triangle{
        square(){
            System.out.println("This is constructor 2");
        }
        square(int a,int b){
            super(a);
            System.out.println("The area of the square is :" +b);
    }
}

    class rectangle extends square{
        rectangle(){
            System.out.println("This is constructor 3");
        }
        rectangle(int a,int b,int c){
            super(a, b);
            System.out.println("The area of the rectangle is :" +c);
        }
}
    
public class constructor_in_inheritance {
    public static void main(String[] args) {
        //triangle tri =new triangle();
        //square sq = new square();
        //rectangle rec = new rectangle();
        rectangle rec = new rectangle(12,17,20);
    }
}
