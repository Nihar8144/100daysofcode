interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class SampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("Hello!");
    }
    public void meth2(){
        System.out.println("Good Morning");
    }
    public void meth3(){
        System.out.println("How are you?");
    }
    public void meth4(){
        System.out.println("I am Nihar");
    }
}
public class Inheritance_in_Interface {
    public static void main(String[] args) {
        SampleClass obj = new SampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}

