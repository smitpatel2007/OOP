// 1.	Write a program to catch the ArithmeticException such as division by zero.

public class pr6_1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;  // Division by zero
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }
        System.out.println("Program continues normally...");
    }
}


