class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Method to display balance
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}


public class pr4_2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountNumber = 12345;
        acc.accountHolderName = "Smit Patel";
        acc.balance = 5000;

        acc.displayBalance();
        acc.deposit(2000);
        acc.withdraw(1500);
        acc.displayBalance();
    }
}

