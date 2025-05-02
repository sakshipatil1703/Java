class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void balanceEnquiry() {
        System.out.println("Current Balance: ₹" + balance);
    }

   
    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit a negative amount.");
        }
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

 
    public void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw a negative amount.");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance. Cannot withdraw ₹" + amount);
        }
        balance -= amount;
        System.out.println("₹" + amount + " withdrawn successfully.");
    }
}


public class BankException {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000.0);

        try {
            account.balanceEnquiry();
            account.deposit(1500);     
            account.withdraw(3000);      
            account.deposit(-100);        
        } catch (NegativeNumberException | LowBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            account.withdraw(5000); 
        } catch (NegativeNumberException | LowBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        account.balanceEnquiry();    
    }
}
