import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}

// command line
public class SumOfDigits {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int sum = 0;

        // Calculate sum of digits
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}
