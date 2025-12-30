class Employee{
    int id;
    String name;
    double basicSalary;
    Employee(int id, String name, double basicSalary){
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    void displayEmployeeDetails(){
        System.out.println("Employee ID is: "+this.id);
        System.out.println("Employee name is: "+this.name);
        System.out.println("Employee's Basic Salary is: "+this.basicSalary);
    }
}
class Manager extends Employee{
    double bonus;
    Manager(int id, String name, double basicSalary, double bonus){
        super(id, name, basicSalary);
        this.bonus = bonus;
    }
    void ManagerDetails(){
        super.displayEmployeeDetails();
        System.out.println("Manager's bonus is: "+this.bonus);
        System.out.println("Manager's Total Salary is: "+(this.bonus+super.basicSalary));
    }
}
public class Inheritance {
    static void InheritanceUsage(){
        Manager m = new Manager(1234, "Aman",2000000, 500000);
        m.ManagerDetails();
    }
}

