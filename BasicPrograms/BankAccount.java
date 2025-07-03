package seleniumPractice;

public class BankAccount {
    private double balance; // Encapsulates the account balance

    // Constructor to initialize the account with an initial balance
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        }
    }

    // Method to deposit funds into the account
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit of " + amount + " successful.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw funds from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (this.balance >= amount) {
                this.balance -= amount;
                System.out.println("Withdrawal of " + amount + " successful.");
            } else {
                System.out.println("Insufficient funds for withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display the current account balance
    public void displayBalance() {
        System.out.println("Current balance: " + this.balance);
    }

    public static void main(String[] args) {
        // Create a new BankAccount object
        BankAccount myAccount = new BankAccount(1000.0);

        // Perform operations
        myAccount.displayBalance(); // Shows initial balance
        myAccount.deposit(500.0);   // Deposits 500
        myAccount.displayBalance(); // Shows updated balance
        myAccount.withdraw(200.0);  // Withdraws 200
        myAccount.displayBalance(); // Shows updated balance
        myAccount.withdraw(1500.0); // Tries to withdraw more than available
        myAccount.displayBalance(); // Balance remains unchanged
    }
}