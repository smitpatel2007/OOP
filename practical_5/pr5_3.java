import java.util.Scanner;

public class pr5_3 {

    // Class with overloaded methods
    static class BankInterest {

        // Method 1: Takes amount and rate (default 1 year)
        void findInterest(double amount, double rate) {
            double interest = (amount * rate * 1) / 100;
            System.out.println("Interest for 1 year: ₹" + interest);
        }

        // Method 2: Takes amount, rate, and number of years
        void findInterest(double amount, double rate, int years) {
            double interest = (amount * rate * years) / 100;
            System.out.println("Interest for " + years + " years: ₹" + interest);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankInterest bi = new BankInterest();

        // Take input from user
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter interest rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter number of years (enter 1 if only using 2-parameter method): ");
        int years = sc.nextInt();

        // Call method based on year
        if (years == 1) {
            // Call 2-parameter method
            bi.findInterest(amount, rate);
        } else {
            // Call 3-parameter method
            bi.findInterest(amount, rate, years);
        }

        sc.close();
    }
}
