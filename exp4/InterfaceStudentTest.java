class Student {
    private int rollNo;
    
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    
    public int getRollNo() {
        return rollNo;
    }
}

class Test extends Student {
    protected int sub1, sub2;
    
    public void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }
    
    public void getMarks() {
        System.out.println("Marks: Subject 1 = " + sub1 + ", Subject 2 = " + sub2);
    }
}

interface Sports {
    int sMarks = 0; 
    void set(int sMarks);
}

class Result extends Test implements Sports {
    private int sportsMarks;
    
    @Override
    public void set(int sMarks) {
        this.sportsMarks = sMarks;
    }
    
    public void display() {
        System.out.println("Roll Number: " + getRollNo());
        getMarks();
        System.out.println("Sports Marks: " + sportsMarks);
        System.out.println("Total Marks: " + (sub1 + sub2 + sportsMarks));
    }
}


public class InterfaceStudentTest {
    public static void main(String[] args) {
        Result student = new Result();
        student.setRollNo(101);
        student.setMarks(85, 90);
        student.set(20); 
        student.display();
    }
}
