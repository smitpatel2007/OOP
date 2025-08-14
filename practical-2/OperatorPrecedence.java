import java.util.Scanner;

public class OperatorPrecedence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = input.nextInt();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        // Expression 1: a + b * c
        // Multiplication has higher precedence than addition
        System.out.println(a + b * c);

        // Expression 2: ++a * b - c
        // Pre-increment increases a first, then multiplication, then subtraction
        System.out.println(++a * b - c);

        // Expression 3: a / b + c
        // Division happens first, then addition
        System.out.println(a / b + c);

        input.close();
    }
}
