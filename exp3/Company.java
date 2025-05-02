class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus(double percentage) {
        return salary * percentage;
    }

    public void generateReport() {
        System.out.println("Performance Report for " + name + " (" + jobTitle + ")");
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    public void manageProject() {
        System.out.println(name + " is managing a project.");
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }


    public void develop() {
        System.out.println(name + " developing a application.");
    }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    public void debugCode() {
        System.out.println(name + " is writing code.");
    }
}

public class Company {
    public static void main(String[] args) {
        Manager mgr = new Manager("Sakshi", "123 Street,Rajarampuri", 80000);
        Developer dev = new Developer("Shruti","456 Main road, Kagal", 70000);
        Programmer prog = new Programmer("Shruti","789 Kolhapur", 60000);

        System.out.println("***** Manager *****");
        mgr.generateReport();
        System.out.println("Bonus: " + mgr.calculateBonus(2));
        mgr.manageProject();

        System.out.println("\n***** Developer *****");
        dev.generateReport();
        System.out.println("Bonus: " + dev.calculateBonus(1.5));
        dev.develop();

        System.out.println("\n***** Programmer *****");
        prog.generateReport();
        System.out.println("Bonus: " + prog.calculateBonus(1.25));
        prog.debugCode();
    }
}
