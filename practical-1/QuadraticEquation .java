import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        // Calculate discriminant
        double d = b * b - 4 * a * c;

        System.out.println("The equation is: " + a + "x² + " + b + "x + " + c + " = 0");

        // Check if roots are real
        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and same.");
            System.out.println("Root = " + root);
        } else {
            System.out.println("Roots are imaginary (not real).");
        }

        input.close();
    }
}
