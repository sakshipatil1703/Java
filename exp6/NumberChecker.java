class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class NumberChecker {

    public static void checkEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("The number " + number + " is odd.");
        } else {
            System.out.println("The number " + number + " is even.");
        }
    }

    public static void main(String[] args) {
        int number = 7; 

        try {
            checkEven(number);
        } catch (OddNumberException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling...");
    }
}
