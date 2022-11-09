class Employee{
    int Salary;
    String Name;

    public int getSalary(){
        return Salary;
    }
    public String getName(){
        return Name;
    }
    public void setName(String n){
        Name=n;
    }
}
public class oops {
    public static void main(String[] args) {
        Employee Nihar=new Employee();
        Nihar.setName("Nihar Ranjan Meher");
        Nihar.Salary=4000000;
        System.out.println(Nihar.getName());
        System.out.println(Nihar.getSalary());
        }
    }
