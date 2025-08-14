import java.util.Scanner;

public class FloatOperations {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter first float number: ");
        float num1 = input.nextFloat();

        System.out.print("Enter second float number: ");
        float num2 = input.nextFloat();

        // Perform operations
        float sum = num1 + num2;
        float difference = num1 - num2;
        float product = num1 * num2;
        float quotient = num1 / num2;
        float modulus = num1 % num2;

        // Display results
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Quotient = " + quotient);
        System.out.println("Modulus = " + modulus);

        // Close the scanner
        input.close();
    }
}

// command line
public class FloatOperations {
    public static void main(String[] args) {
        // Convert command line arguments (Strings) to floats
        float num1 = Float.parseFloat(args[0]);
        float num2 = Float.parseFloat(args[1]);

        // Perform operations
        float sum = num1 + num2;
        float difference = num1 - num2;
        float product = num1 * num2;
        float quotient = num1 / num2;
        float modulus = num1 % num2;

        // Display results
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Quotient = " + quotient);
        System.out.println("Modulus = " + modulus);
    }
}


