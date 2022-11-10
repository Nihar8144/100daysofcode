class Employee{
    private int id;
    private String name;

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
        id=i;
    }
}

public class accessmodifier {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setname("Sarbes");
        System.out.println(emp.getname());
        emp.setid(101);
        System.out.println(emp.getid());
    }
}
