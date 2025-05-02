class BankAccount {
    double balance;
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
    
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    
    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied. Minimum balance of 100 must be maintained.");
        } else {
            super.withdraw(amount);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(500);
        sa.displayBalance();
        sa.deposit(200);
        sa.withdraw(550);
        sa.displayBalance();
        sa.withdraw(50);
        sa.displayBalance();
        sa.withdraw(50);
    }
}
