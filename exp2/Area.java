import java.util.Scanner;
class Area {
    double length;
    double breadth;
    double area;

    public void setDim(){
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the length :");
       length=sc.nextDouble();
       System.out.println("Enter the breadth :");
       breadth=sc.nextDouble();

       sc.close();
    }
    public void getArea(){
       area = length * breadth;
       System.out.println("Area of Rectangle : "+area );
    }

    public static void main(String args[]){
 
        Area a1= new Area();
        a1.setDim();
        a1.getArea();
    }
    

}