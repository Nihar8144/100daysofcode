class Student{

    private String name;
    private int id;

    public Student(){
        name="Nihar";
        id=01;
    }
    public Student(String myname, int myid){
        name= myname;
        id= myid;
    }

    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }
    public int getid(){
        return id;
    }
    public void setid(int i){
        id= i;
    }
}

public class constructor{
    public static void main(String[] args) {
    
        Student Anurag= new Student();
        System.out.println(Anurag.getname());
        System.out.println(Anurag.getid());

    }
}