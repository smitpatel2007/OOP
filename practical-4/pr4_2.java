import java.util.Scanner;

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
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount();

       
        System.out.print("Enter Account Holder Name: ");
        acc.accountHolderName = sc.nextLine();

        System.out.print("Enter Account Number: ");
        acc.accountNumber = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        acc.balance = sc.nextDouble();

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        acc.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        acc.withdraw(withdrawAmount);

        // Display final details
        acc.displayBalance();

        sc.close();
    }
}
