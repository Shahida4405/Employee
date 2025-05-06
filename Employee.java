public class Employee{
    String name;
    int id;
    double salary;
    int Experiance;
    public Employee(String name,int id,double salary,int Experiance){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.Experiance=Experiance;
    }
    public void display(){
        System.out.println("Employee ID:"+id);
        System.out.println("Employee Name:"+name);
        System.out.println("Salary:"+salary);
        System.out.println("Experiance:"+Experiance);
    }
    public static void main(String[] args) {
        Employee emp1=new Employee("xyz",101,50000,4);
        emp1.display();
    }
}