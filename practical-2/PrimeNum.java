import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        // (a) Using for loop
        System.out.println("\nPrime numbers using for loop:");
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        // (b) Using while loop
        System.out.println("\n\nPrime numbers using while loop:");
        int num = 2;
        while (num <= n) {
            boolean isPrime = true;
            int i = 2;
            while (i < num) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
            num++;
        }

        // (c) Using do-while loop
        System.out.println("\n\nPrime numbers using do-while loop:");
        num = 2;
        do {
            boolean isPrime = true;
            int i = 2;
            do {
                if (num % i == 0 && i != num) {
                    isPrime = false;
                    break;
                }
                i++;
            } while (i < num);
            if (isPrime) {
                System.out.print(num + " ");
            }
            num++;
        } while (num <= n);

        input.close();
    }
}
