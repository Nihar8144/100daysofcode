class Thr1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Thank you: ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thr2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome: ");
        }
    }
}

public class thread_methods {
    public static void main(String[] args){
        Thr1 t1 = new Thr1();
        Thr2 t2 = new Thr2();
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }

        t2.start();

    }
}
