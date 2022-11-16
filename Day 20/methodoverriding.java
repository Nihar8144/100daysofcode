class Nihar{
    public void meth1(){
        System.out.println("This is method 1 of class Nihar");
    }
    public void meth2(){
        System.out.println("This is method 2 of class Nihar");
    }
}

class Tusar extends Nihar{
    public void meth2(){
        System.out.println("This is method 2 of class Tusar");
    }
    public void meth3(){
        System.out.println("This is method 3 of class Tusar");
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        Nihar n = new Nihar();
        n.meth2();

        Tusar t = new Tusar();
        t.meth2();
    }
}
