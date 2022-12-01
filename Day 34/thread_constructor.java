class thr extends Thread{
    public thr(String name){
        super(name);
    }
    public void run(){
        int i;
        for(i=0;i<=50;i++){
            System.out.println("This is a Thread");
        }
    }
}
public class thread_constructor{
    public static void main(String[] args) {
        thr t1 = new thr("Nihar");
        t1.start();
        thr t2 = new thr("Tusar");
        t2.start();
        System.out.println("The ID of the Thread t is " + t1.getId());
        System.out.println("The name of the Thread t is " + t1.getName());
        System.out.println("The ID of the Thread t is " + t2.getId());
        System.out.println("The name of the Thread t is " + t2.getName());
    }
}