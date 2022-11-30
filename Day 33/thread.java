class threadrunnable1 implements Runnable{
    public void run(){
        int i;
        for(i=0;i<=100;i++){
        System.out.println("This is Thread 1.");
        }
    }
}
class threadrunnable2 implements Runnable{
    public void run(){
        int i;
        for(i=0;i<=100;i++){
        System.out.println("This is Thread 2.");
        }
    }
}
public class thread {
    public static void main(String[] args) {
        threadrunnable1 tr1 = new threadrunnable1();
        Thread t1 = new Thread(tr1);
        threadrunnable2 tr2 = new threadrunnable2();
        Thread t2 = new Thread(tr2);
        t1.start();
        t2.start();

    }
}
