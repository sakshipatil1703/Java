class StaticDemo {
 
    static int count;
    static String companyName;


    static {
        count = 100;
        companyName = "TechMahindra";
        System.out.println("Static block executed: Initia lized static variables.");
    }

    static void displayInfo() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Count: " + count);
    }

    void incrementCount() {
        count++;
    }
}

public class StaticTest {
    public static void main(String[] args) {
        
        StaticDemo.displayInfo();

        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        obj1.incrementCount();
        obj2.incrementCount();

        StaticDemo.displayInfo();
    }
}
