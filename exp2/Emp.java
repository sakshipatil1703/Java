class Employee {
    String fName;
    String lName;
    double salary;

    public Employee(String fname, String lname, double salary) {
        this.fName = fname;
        this.lName = lname;
        setSalary(salary);
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            this.salary = 0.0;
        } else {
            this.salary = salary;
        }
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percentage) {
        this.salary += this.salary * (percentage / 100);
        System.out.println("Salary after " + percentage + "% raise: " + salary);
    }
}

class EmployeeTest extends Employee {

    public EmployeeTest(String fName, String lName, double salary) {
        super(fName, lName, salary); 
    }

    public double getYearlySalary() {
        return getSalary() * 12;
    }

    public void display() {
        System.out.println("\n **** Displaying Employee Information ****");
        System.out.println("Employee Name : " + getfName() + " " + getlName());
        System.out.println("Monthly Salary : " + getSalary());
        System.out.println("Yearly Salary : " + getYearlySalary());
    }
}

public class Emp {
    public static void main(String[] args) {
        EmployeeTest emp = new EmployeeTest("Sakshi", "Patil", 50000);
        emp.display();
        
        System.out.println("\nApplying a 10% raise:");
        emp.raiseSalary(10);
        emp.display();
    }
}
