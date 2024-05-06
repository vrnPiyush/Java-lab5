interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
}

class SavingsAccount implements BankAccount {
    private double balance;
    private final double interestRate = 0.05;

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * interestRate);
        System.out.println("Amount Deposited: " + amount);
        System.out.println("Savings Account Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount Withdrawen: " + amount);
            System.out.println("Savings Account Balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

class CurrentAccount implements BankAccount {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
        System.out.println("Current Account Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount Withdrawen: " + amount);
            System.out.println("Current Account Balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

public class Code1 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();

    
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(500);
        


        currentAccount.deposit(2000);
        currentAccount.withdraw(1000);
      
    }
}
