abstract class Shape {
    protected double dim1, dim2;
    
    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    
    abstract double area();
}

class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width);
    }
    
    @Override
    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Shape {
    public Triangle(double base, double height) {
        super(base, height);
    }
    
    @Override
    double area() {
        return 0.5 * dim1 * dim2;
    }
}

public class AbstractShape {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        Triangle tri = new Triangle(8, 4);
        
        System.out.println("Area of Rectangle: " + rect.area() + " sq.meters");
        System.out.println("Area of Triangle: " + tri.area() + " sq.meters");
    }
}
