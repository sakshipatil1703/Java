import ExceptionHandlingDemo.Calculator;
import ExceptionHandlingDemo.DivisionException;

public class CalculatorException {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        try {
            int result = calc.divide(10, 0);  
            System.out.println("Result: " + result);
        } catch (DivisionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}
