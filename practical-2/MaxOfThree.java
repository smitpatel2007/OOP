import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter 3 numbers
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        // Find maximum number
        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        // Print the result
        System.out.println("Maximum number is: " + max);
    }
}


// using command line
public class MaxOfThree {
    public static void main(String[] args) {
        // Convert command line arguments (Strings) to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        // Find maximum number
        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        // Print the result
        System.out.println("Maximum number is: " + max);
    }
}

