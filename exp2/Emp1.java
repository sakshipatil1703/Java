public class Emp1 {
    public static void main(String[] args) {
        EmployeeTest emp = new EmployeeTest("Sakshi", "Patil", 50000);
        emp.display();
    
        System.out.println("\nApplying a 10% raise:");
        emp.raiseSalary(10);
        emp.display();
    }
}
